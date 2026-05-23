package com.empapp.dao;

import java.util.List;

import com.empapp.dto.Dept;

public interface DeptDAO {

	void addDept(Dept d);

	void findById(Dept d);

	List<Dept> findAll();

	void updateDept(Dept d);

	void deleteDept(Integer dno);
}
