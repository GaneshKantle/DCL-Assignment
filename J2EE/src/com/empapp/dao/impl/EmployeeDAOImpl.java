package com.empapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.empapp.dao.EmployeeDAO;
import com.empapp.dto.Employee;
import com.empapp.utility.Connector;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection con;

	public EmployeeDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public void addEmployee(Employee e) {
		String query = "INSERT INTO EMPP (ename, job, sal, dno, createdAt, mail, password)\r\n"
				+ "VALUES (?, ?, ?, ?, SYSDATE, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, e.getEname());
			ps.setString(2, e.getJob());
			ps.setDouble(3, e.getSal());
			ps.setInt(4, e.getDno());
			ps.setString(5, e.getMail());
			ps.setString(6, e.getPassword());

			ps.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Failed to add the data");
		}

	}

	@Override
	public Employee findById(Integer eno) {
		String query = "SELECT * FROM EMPP WHERE eno = ?";
		Employee e = null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, eno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				e = new Employee();
				e.setEno(rs.getInt("eno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSal(rs.getDouble("Salary"));
				e.setDno(rs.getInt("dno"));
				e.setCreatedAt(rs.getString("created_at"));
				e.setMail(rs.getString("mail"));
				e.setPassword(rs.getString("password"));

			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Failed to fetch the data");
		}

		return e;
	}

	@Override
	public List<Employee> FindAll() {
		String query = "SELECT * FROM EMPP";
		Employee e = null;
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(query);
//			ps.setInt(1, eno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				e = new Employee();
				e.setEno(rs.getInt("eno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSal(rs.getDouble("Salary"));
				e.setDno(rs.getInt("dno"));
				e.setCreatedAt(rs.getString("created_at"));
				e.setMail(rs.getString("mail"));
				e.setPassword(rs.getString("password"));
				list.add(e);
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Failed to fetch the data");
		}

		return list;
	}
	
	

	@Override
	public Employee findByMailandPassword(String mail, String password) {
		String query = "SELECT * FROM EMPP WHERE mail = ? and password = ?";
		Employee e = null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, mail);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				e = new Employee();
				e.setEno(rs.getInt("eno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSal(rs.getDouble("Salary"));
				e.setDno(rs.getInt("dno"));
				e.setCreatedAt(rs.getString("created_at"));
				e.setMail(rs.getString("mail"));
				e.setPassword(rs.getString("password"));

			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Failed to fetch the data");
		}

		return e;
	}

	@Override
	public void updateEmployee(Employee e) {

	}

	@Override
	public void deleteById(Integer eno) {

	}

}