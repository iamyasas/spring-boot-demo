package com.iamyasas.springbootdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootdemo.model.Employee;
import com.iamyasas.springbootdemo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees(){
		
		return new ResponseEntity<List<Employee>>(
			service.getEmployees(), 
			HttpStatus.OK
		);
	}
	
	@GetMapping("/employees/{empID}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int empID) {
		
		return ResponseEntity
			.ok()
			.body(service.getEmployee(empID));
			
	}
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee) {
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(
			service.postEmployee(employee),  
			HttpStatus.CREATED
		);
		
		return responseEntity; 
	}
}
