package com.dreamteam.springboot.crud.dao;

import java.util.List;

import com.dreamteam.springboot.crud.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteBeId(int theId);
}
