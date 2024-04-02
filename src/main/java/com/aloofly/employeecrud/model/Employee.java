package com.aloofly.employeecrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "employee")
@Entity
@Data
public class Employee {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "city")
	private String city;

	@Column(name = "salary")
	private int salary;

	@Column(name = "designation")
	private String designation;

	@Column(name="department")
	private String department;
	
	public Employee() {

	}

	public Employee(int id, String name, String city, int salary, String designation,String department) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.designation = designation;
		this.department=department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public String toString() {
		return this.id + " " + this.name + " " + this.city + " " + this.salary + " " + " "+this.department+" "+this.designation;
	}
}
