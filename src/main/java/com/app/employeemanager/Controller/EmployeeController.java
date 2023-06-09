package com.app.employeemanager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employeemanager.model.Employee;
import com.app.employeemanager.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping( "/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		System.out.println("getAll");
		List<Employee> employees = employeeService.findAll();
		System.out.println(employees);
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws Throwable {
		Employee employee = employeeService.findEmployeeById(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee newEmployee = employeeService.add(employee);
		return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee newEmployee = employeeService.update(employee);
		return new ResponseEntity<>(newEmployee,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") Long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
