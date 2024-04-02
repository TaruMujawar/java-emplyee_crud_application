package com.aloofly.employeecrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aloofly.employeecrud.model.Employee;

@Service
public interface IEmployeeService {
	List<Employee> getAllEmployee();
	
	void deleteEmployeeBYId(int id);
	
	Employee createEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
}
