package com.getarrays.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getarrays.exception.UserNotFoundException;
import com.getarrays.model.Employee;
import com.getarrays.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo=employeeRepo;
	}
	
	public Employee add(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
	
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	public Employee update(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Employee findEmployeeById(Long id) throws Throwable {
		return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User not found"));
	}
	
	public void deleteEmployee(Long id) {
		employeeRepo.deleteEmployeeById(id);
	}

}
