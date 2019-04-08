package com.pro.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_Controller {
	
	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}	
}
