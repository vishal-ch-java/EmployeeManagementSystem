package com.ems.service;

import java.util.List;

import com.ems.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Long employeeid);
	
	public void deleteEmployeeById(Long employeeid);
}
