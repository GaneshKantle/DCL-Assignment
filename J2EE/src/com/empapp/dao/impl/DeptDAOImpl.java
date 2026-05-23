package com.empapp.dao.impl;

import java.sql.Connection;
import java.util.List;
import com.empapp.dao.DeptDAO;
import com.empapp.dto.Dept;
import com.empapp.utility.Connector;
import java.sql.*;

public class DeptDAOImpl implements DeptDAO {
	
	private Connection con;
	
	public DeptDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public void addDept(Dept d) {
		String sql = "INSERT INTO dept (dno, dname, dloc) VALUES (?, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, d.getDno());
			ps.setString(2, d.getDname());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
