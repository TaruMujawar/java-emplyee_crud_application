package com.aloofly.employeecrud.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloofly.employeecrud.model.Employee;
import com.aloofly.employeecrud.repository.IEmployeeRepository;
import com.aloofly.employeecrud.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	 IEmployeeRepository  employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("This is Employee Service Implementation ");
		List<Employee> allEmployee=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(allEmployee::add);
		return allEmployee;
	}

	@Override
	public void deleteEmployeeBYId(int id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
