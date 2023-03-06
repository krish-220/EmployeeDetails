package com.exampledemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampledemo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
