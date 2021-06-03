package com.edureka.ms.employeedetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.ms.employeedetails.model.Employee;


@RestController
public class EmployeeController {

	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetails(@PathVariable String id) {
		
		Employee emp = Employee.builder()
					.empId(id)
					.empName("Dipika")
					.designation("AST")
					.salary(13456777)
					.build();

		
		
		return emp;
	}
	
	
	
	
}
