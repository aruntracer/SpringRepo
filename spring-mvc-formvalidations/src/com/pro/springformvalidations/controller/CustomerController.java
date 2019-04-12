package com.pro.springformvalidations.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an initbinder to convert trim input strings
	//remove leading and trailing whitespace and make it as null if there is only whitespace
	//resolve issues for our validations
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);//String validations for null and whitespace		
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);		
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult theBindingResults) {
		System.out.println("Last name |"+theCustomer.getLastName()+"|");
		System.out.println("Last name |"+theCustomer.getPostalCode()+"|");
		
		System.out.println("theBindingResults "+theBindingResults);
		System.out.println("\n\n\n\n");
		if (theBindingResults.hasErrors()) {
			System.out.println("Form has errors");
			return "customer-form";
		}else {
			System.out.println("Form has no errors");
		return "customer-confirmation";
		}
	}
	
}
