package com.pro.springformtags.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create a new student object
		Student theStudent = new Student();
		//add student object to the model attribute
		theModel.addAttribute("student",theStudent);
		return "student-form";		
	}
	
	@RequestMapping("/processForm") //this processForm request mapping should match with the form action
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("Student First Name "+theStudent.getFirstName());
		System.out.println("Student Last Name "+theStudent.getLastName());
		System.out.println("Student Country "+theStudent.getCountry());
		
		return "student-confirmation";
		
	}
}
