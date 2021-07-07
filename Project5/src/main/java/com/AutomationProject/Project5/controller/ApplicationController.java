package com.AutomationProject.Project5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApplicationController {
	
	@RequestMapping("/SBA")
	public String hello()
	{
		return "Welcome to java spring boot appication";
	}

}
