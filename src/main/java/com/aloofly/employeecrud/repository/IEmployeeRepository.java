package com.aloofly.employeecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aloofly.employeecrud.model.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Integer>{

}
