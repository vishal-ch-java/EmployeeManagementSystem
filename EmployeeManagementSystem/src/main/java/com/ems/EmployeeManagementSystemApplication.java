package com.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

/*	@Autowired
	private EmployeeRepository employeeRespository;
	
	@Override
	public void run(String... args) throws Exception{
		
	
		Employee employee1 = new Employee("ramesh", "sheth", "ramesh@gmail.com");
		
		employeeRespository.save(employee1);
		
		Employee employee2 = new Employee("Jigar", "shah", "jigar@gmail.com");
		
		employeeRespository.save(employee2);
		
		Employee employee3 = new Employee("Hitesh", "Jadav", "hitesh@gmail.com");
		
		employeeRespository.save(employee3);
	} */
}
