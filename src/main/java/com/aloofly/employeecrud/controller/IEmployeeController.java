package com.aloofly.employeecrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloofly.employeecrud.model.Employee;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("employee")
public interface IEmployeeController {
	
	@GetMapping("all")
	List<Employee> getAllEmployee();
	
	@DeleteMapping("delete/{id}")
	void deleteEmployeeById(@PathVariable int id);
	
	@PostMapping("create")
	Employee createEmployee(@RequestBody Employee employee);
	
	@PutMapping("update")
	Employee updateEmployee(@RequestBody Employee employee);
}
