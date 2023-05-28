package com.getarrays.employeemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeResource(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
}
