package com.aloofly.employeecrud.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aloofly.employeecrud.controller.IDepartmentController;
import com.aloofly.employeecrud.model.Department;
import com.aloofly.employeecrud.service.IDepartmentService;

@Component
public class DepartmentControllerImpl implements IDepartmentController{

	@Autowired
	 IDepartmentService  departmentService;
	 
	@Override
	public List<Department> getAllDepartment() {
		System.out.println("----------This is Department Controller Implementation--------\n");
		return departmentService.getAllDepartment();
	}
	
}
