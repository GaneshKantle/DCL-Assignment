package com.empapp.dto;

public class Dept {
	private Integer dno;
	private String dname;
	private String location;
	
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", location=" + location + "]";
	}
	
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
