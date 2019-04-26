package com.pro.restwebservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.restwebservice.entity.Student;
import com.pro.restwebservice.exceptions.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	//define postconstruct to load the student data only once
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Arun","kumar"));
		theStudents.add(new Student("Nive","tha"));
		theStudents.add(new Student("Selv","Va"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return theStudents;
	}
	
	@GetMapping("/students/{studendId}")
	public Student getStudent(@PathVariable int studendId){
		
		
		if (studendId >= theStudents.size() || (studendId < 0 )) {
			throw new StudentNotFoundException("Student id not found - "+studendId);
		}
		
		return theStudents.get(studendId);
	}
	
}
