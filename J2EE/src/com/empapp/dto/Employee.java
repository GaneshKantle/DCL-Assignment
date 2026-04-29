package com.empapp.dto;
//this is a POJO class
public class Employee {
	
	
	private Integer eno;  //id auto increment
	private String ename;
	private String job;
	private Double sal;
	private Integer dno;
	private String createdAt; // SYSDATE();
	private String mail;
	private String password;
	

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", dno=" + dno
				+ ", createdAt=" + createdAt + ", mail=" + mail + ", password=" + password + "]";
	}
	
	
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
