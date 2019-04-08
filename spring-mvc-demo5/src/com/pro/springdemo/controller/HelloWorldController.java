package com.pro.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {
	
	String theName;
	String result;
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloword";
	}
	
	//Read form data using request.getParameter and add data to the model
	@RequestMapping("/processFormv2")
	public String processFormv2(HttpServletRequest request,Model model) {
		
		theName = request.getParameter("studentName");
		result = "Yo! "+theName.toUpperCase();		
		model.addAttribute("CallingName", result);		
		return "helloword";
	}
	
	//Read form data using @RequestParam and add data to the model
	@RequestMapping("/processFormv3")
	public String processFormv3(@RequestParam("studentName") String theName,Model model) {
		
		result = "Hey My Friend! "+theName.toUpperCase();		
		model.addAttribute("CallingName", result);		
		return "helloword";
	}
	
}
