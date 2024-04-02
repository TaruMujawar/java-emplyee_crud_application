package com.aloofly.employeecrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloofly.employeecrud.model.Department;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("department")
public interface IDepartmentController {

	@GetMapping("all")
	List<Department> getAllDepartment();
}
