package com.pico.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

	static final Logger logger = LoggerFactory.getLogger(UsersController.class.getName());
	
	@GetMapping("/index")
    public ModelAndView modelAndView(String name) {
		logger.info("user/index");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("from", "com.jj");		
        mv.setViewName("users/index");
        return mv;
    }
}
