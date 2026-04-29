package com.empapp.test;

import java.util.Scanner;
import java.util.*;

import com.empapp.dao.impl.*;
import com.empapp.dto.*;
import com.empapp.dao.*;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		EmployeeDAO edao = new EmployeeDAOImpl();

		Scanner sc = new Scanner(System.in);

		
//		  System.out.println("Enter your name:");
//		  e.setEname(sc.next());
//		  System.out.println("Enter your Job:");
//		  e.setJob(sc.next());
//		  System.out.println("Enter your Salary:");
//		  e.setSal(sc.nextDouble());
//		  System.out.println("Enter your Dept Number:");
//		  e.setDno(sc.nextInt());
//		  System.out.println("Enter your Mail:");
//		  e.setMail(sc.next());
//		  System.out.println("Enter your Password:");
//		  e.setPassword(sc.next());
//		
		//ADD EMPLOYEE//////////////////////////////////////////////////////////
//		  edao.addEmployee(e); 
//		  System.out.println("Data added Sucessfully!");
//		 
		//FIND BY ID///////////////////////////////////////////////////////////
//		System.out.println("Enter your ID:");
//		Employee empl = edao.findById(sc.nextInt());
//		System.out.println(empl);
		
		//FIND BY MAIL AND PASSWORD////////////////////////////////////////////
//		System.out.println("Enter your Mail:");
//		Employee mail = edao.findByMailandPassword(sc.next(), sc.next());
//		System.out.println(mail);
		
		
		//FIND ALL////////////////////////////////////////////////////////////
//		List<Employee> ul = new ArrayList<>();
//		ul = edao.FindAll();
//		System.out.println(ul);
		
	}

}
