package com.pro.sqlservercrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.sqlservercrud.exception.ResourceNotFoundException;
import com.pro.sqlservercrud.model.Employees;
import com.pro.sqlservercrud.repo.EmployeesRepository;

@RestController
public class AppController {
	
	@Autowired
	private EmployeesRepository empRepo;
		
	@GetMapping("/employees")
	public List<Employees> getAllEmployees(){
		return empRepo.findAll();
	}
	
	@GetMapping("/employee/findBySno/{sno}")
	public Employees getEmployeeBySno(@PathVariable(value="sno") Long sno) throws ResourceNotFoundException {
		Employees emp = empRepo.findById(sno).orElseThrow(()-> new ResourceNotFoundException("Employee not found for id "+sno));
		return emp;
	}
	
	@GetMapping("/employee/findByName/{name}")
	public ResponseEntity<Employees> getEmployeeByName(@PathVariable(value="name") String name) throws ResourceNotFoundException{
		Employees emp = empRepo.findByName(name).orElseThrow(()-> new ResourceNotFoundException("Employee not found for name "+name));
		return ResponseEntity.ok().body(emp);
	}
	
	@GetMapping("/employee/findByName/{name}/{age}")
	public ResponseEntity<Employees> getEmployeeByNameAndAge(@PathVariable(value="name") String name,@PathVariable(value="age")int age) throws ResourceNotFoundException{
		Employees emp = empRepo.findByNameAndAge(name,age).orElseThrow(()-> new ResourceNotFoundException("Employee not found for name "+name+" and age "+age));
		return ResponseEntity.ok().body(emp);
	}
	
	@GetMapping("/employee1/{sno}")
	public ResponseEntity<Employees> getEmployeeBySnoResp(@PathVariable(value="sno") Long sno) throws ResourceNotFoundException {
		Employees emp = empRepo.findById(sno).orElseThrow(()-> new ResourceNotFoundException("Employee not found for id r "+sno));
		return ResponseEntity.ok().body(emp);		
	}
	
	@PostMapping("/employee")
	public Employees createEmployee(@Valid @RequestBody Employees employeeIn) {
		
		return empRepo.save(employeeIn);
	}
	
	@PutMapping("/employee/{sno}")
	public ResponseEntity<Employees> updateEmployee(@PathVariable(value = "sno") Long sno,@Valid @RequestBody Employees employeeDetails) throws ResourceNotFoundException {
		Employees emp = empRepo.findById(sno).orElseThrow(()-> new ResourceNotFoundException("Employee not found for id r "+sno));
		emp.setName(employeeDetails.getName());
		emp.setAge(employeeDetails.getAge());
		Employees updatedEmp = empRepo.save(emp);
		return ResponseEntity.ok().body(updatedEmp);
	}
	
	@DeleteMapping("/employee/{sno}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value="sno") Long sno){
		empRepo.deleteById(sno);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return response;
	}
	
}
