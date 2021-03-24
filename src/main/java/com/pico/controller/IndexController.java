package com.pico.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	static final Logger logger = LoggerFactory.getLogger(IndexController.class.getName());
	
	@GetMapping("/index")
    public ModelAndView index(String name) {
		logger.info("index");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
