package com.aloofly.employeecrud.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aloofly.employeecrud.controller.IEmployeeController;
import com.aloofly.employeecrud.model.Employee;
import com.aloofly.employeecrud.service.IEmployeeService;

@Component
public class EmployeeControllerImpl implements IEmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("Welcome to employee controller impl");
		return employeeService.getAllEmployee();
	}

	@Override
	public void deleteEmployeeById(int id) {
		System.out.println(id);
		employeeService.deleteEmployeeBYId(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		System.out.println(employee);
		return employeeService.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		System.out.println(employee);
		return employeeService.updateEmployee(employee);
	}

}
