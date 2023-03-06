package com.exampledemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String employeeName;
	private String empSalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", empSalary=" + empSalary + "]";
	}
	public Employee(int id, String employeeName, String empSalary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		super();
	}

}
