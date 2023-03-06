package com.exampledemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampledemo.entity.Employee;
import com.exampledemo.service.EmployeeService;

@Controller
@RestController("/employee")
public class EmployeeController {
	private EmployeeService es;
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.addEmployee(employee);
		
	}
	@PutMapping("updateBy/{id}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return es.updateEmployee(employee);
		
	}
	@DeleteMapping("deleteBy/{id}")
	public void deleteEmployee(@PathVariable int id) {
		es.deleteEmployee(id);
	}
	@GetMapping("getBy/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return es.getEmployee(id);
		
	}

}
