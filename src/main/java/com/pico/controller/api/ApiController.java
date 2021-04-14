package com.pico.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api/v1")
@Api(tags="ApiController")
public class ApiController {

	@ApiOperation(value="hello", notes="測試用")
	@GetMapping(value="/hello")	
	public String hello() {
		return "hello";
	}
}