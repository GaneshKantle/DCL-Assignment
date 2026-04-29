package com.empapp.dao.impl;

import java.sql.Connection;
import java.util.List;
import com.empapp.dao.DeptDAO;
import com.empapp.dto.Dept;
import com.empapp.utility.Connector;

public class DeptDAOImpl implements DeptDAO {
	
	private Connection con;
	
	public DeptDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public void addDept(Dept d) {
		
	}

	@Override
	public void findById(Dept d) {
		
	}

	@Override
	public List<Dept> findAll() {

		return null;
	}

	@Override
	public void updateDept(Dept d) {

		
	}

	@Override
	public void deleteDept(Integer dno) {
		
	}

}
