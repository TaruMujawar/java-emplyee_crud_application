package com.aloofly.employeecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aloofly.employeecrud.model.Department;

@Repository
public interface IDepartmentRepositry extends CrudRepository<Department,Integer>{

}
