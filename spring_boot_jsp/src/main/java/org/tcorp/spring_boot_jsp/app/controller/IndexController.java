package org.tcorp.spring_boot_jsp.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in next.jsp page !!");
		return "next";
	}
	
	@RequestMapping("/index")
	public String index(Map<String, Object> model) {
		model.put("message", "You are in index.jsp page !!");
		return "next";
	}

}