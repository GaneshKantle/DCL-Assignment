package com.empapp.dao;

import com.empapp.dto.Dept;
import java.util.List;

//Nothing

public interface DeptDAO {

	void addDept(Dept d);

	void findById(Dept d);

	List<Dept> findAll();

	void updateDept(Dept d);

	void deleteDept(Integer dno);
}
