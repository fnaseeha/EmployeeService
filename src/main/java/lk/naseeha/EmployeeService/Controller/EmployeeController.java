package lk.naseeha.EmployeeService.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.naseeha.EmployeeService.Repository.Employee;

@RestController
@RequestMapping("/services")
public class EmployeeController {
	
	@RequestMapping("/hello")
	public String greetintg(){
		return "Hello from Spring boot";
	}
	
	@RequestMapping("/Employee")
	public List<Employee> getAllEmployee(){
		return Employee.getAllEmployee();
	}
}
