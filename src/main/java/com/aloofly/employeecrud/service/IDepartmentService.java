package com.aloofly.employeecrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aloofly.employeecrud.model.Department;

@Service
public interface IDepartmentService {
	List<Department> getAllDepartment();
}
