package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public String getListofAllEmployee(Model model) {
		
		model.addAttribute("employees", employeeService.getAllEmployees());
		
		return "index";
	}
	@GetMapping("/addnewemployee")
	public String addNewEmployee(Model model) {
		Employee employee = new Employee(); 
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	
	@PostMapping("/newemployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		
		employeeService.saveEmployee(employee);
		
		return "redirect:/employees";
	}
	
	@GetMapping("/updateEmployee/{employeeid}")
	public String updateEmployee(@PathVariable ("employeeid") long employeeid, Model model) {
	
		Employee employee = employeeService.getEmployeeById(employeeid);
	
		model.addAttribute("employee", employee);
		
		return "updateEmployeeForm"; 
	}
	
	@PostMapping("/updateEmployee/{employeeid}")
	public String updateEmployee(@ModelAttribute Employee employee)
	{
//		Employee employee = employeeService.getEmployeeById(employeeid);
		
		employeeService.saveEmployee(employee);
		
		return "redirect:/employees";
	}
	
	@GetMapping("/deleteEmployee/{employeeid}")
	public String deleteEmployee(@PathVariable("employeeid") long employeeid)
	{
		employeeService.deleteEmployeeById(employeeid);
		
		return "redirect:/employees";
	}
	
}
