package com.pico.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vue")
public class VueController {
	
	static final Logger logger = LoggerFactory.getLogger(VueController.class.getName());	
	
	@GetMapping("/")
    public ModelAndView index(String name) {
		logger.info("vue");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("vue");
        return mv;
    }
}
