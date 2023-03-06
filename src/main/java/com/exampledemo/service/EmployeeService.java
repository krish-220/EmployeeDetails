package com.exampledemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampledemo.dao.EmployeeRepository;
import com.exampledemo.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;
	  
	public Employee addEmployee(Employee employee) {
		return emprepo.save(employee);
		
	}
	
	public Employee updateEmployee(Employee employee) {
		return emprepo.save(employee);
		
	}
	public Employee getEmployee(int id) {
		return emprepo.findById(id).get();
		
	}
	public void deleteEmployee(int id) {
		emprepo.deleteById(id);
	}
	

}
