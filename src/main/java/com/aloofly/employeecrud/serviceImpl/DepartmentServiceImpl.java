package com.aloofly.employeecrud.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloofly.employeecrud.model.Department;
import com.aloofly.employeecrud.repository.IDepartmentRepositry;
import com.aloofly.employeecrud.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	IDepartmentRepositry departmentRepositry;

	@Override
	public List<Department> getAllDepartment() {
		System.out.println("----------This is Department Service Implementation--------");
		List<Department> allDepartment = new ArrayList<Department>();
		departmentRepositry.findAll().forEach(allDepartment::add);
		return allDepartment;
	}

}
