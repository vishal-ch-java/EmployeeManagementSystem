package com.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
	}
	public Employee saveEmployee(Employee employee) {
			return employeeRepository.save(employee);
	}
	public Employee getEmployeeById(Long employeeid) {
		
		return employeeRepository.getById(employeeid);
	}
	
	public void deleteEmployeeById(Long employeeid) {
		
		employeeRepository.deleteById(employeeid);
	}
}
