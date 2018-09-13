package com.iamyasas.springbootdemo.services;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.iamyasas.springbootdemo.model.Employee;

@Service
public class EmployeeService {
	private AtomicInteger uid = new AtomicInteger(0);
	private List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public Employee getEmployee(int uid) {
		Employee empplyee = employees.stream()
				.filter(employee -> uid == employee.getId())
				.findFirst()
				.orElse(null);
		return empplyee;
	}

	public Employee postEmployee(Employee employee) {
		employee.setId(uid.incrementAndGet());
		employees.add(employee);
		
		return employee;
	}
}
