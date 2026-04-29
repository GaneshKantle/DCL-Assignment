package com.empapp.dao;

import java.util.List;

import com.empapp.dto.Employee;

public interface EmployeeDAO {

	void addEmployee(Employee e);

	Employee findById(Integer eno);

	List<Employee> FindAll();

	Employee findByMailandPassword(String mail, String password);

	void updateEmployee(Employee e);

	void deleteById(Integer eno);
}