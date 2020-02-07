package lk.naseeha.EmployeeService.Repository;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	

	String employeeName;
	String employeeLocation;

	public Employee(String employeeName,String employeeLocation){
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeLocation() {
		return employeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	
	public static List<Employee>  getAllEmployee(){
		List<Employee> AllEmployee = new ArrayList<>();
		AllEmployee.add(new Employee("Naseeha","Kandy"));
		AllEmployee.add(new Employee("Rumesha","Panadura"));
		AllEmployee.add(new Employee("Alvin","Gampaha"));
		AllEmployee.add(new Employee("Sukumar","Vavuniya"));
		AllEmployee.add(new Employee("Niresh","Piliyandala"));
		return AllEmployee;
	}

}
