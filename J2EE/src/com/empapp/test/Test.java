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

		
		//ADD EMPLOYEE//////////////////////////////////////////////////////////
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
////		
//		  edao.addEmployee(e); 
//		  System.out.println("Data added Sucessfully!");
////		 
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
		
		
		//DELETE ////////////////////////////////////////////////////////////
//		System.out.println("Enter your ID:");
//		 edao.deleteById(sc.nextInt());
//		System.out.println("Data Deleted Successfully");
		
		
		
		//UPDATE ////////////////////////////////////////////////////////////
		System.out.println("Enter the ID");
		Employee emp= edao.findById(sc.nextInt());
		System.out.println("------------------------------------------");
		System.out.println("Before Updating the data:");
		System.out.println(emp);
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Enter your choice");
		System.out.println("1. Name");
		System.out.println("2. Job");
		System.out.println("3. Salary");
		System.out.println("4. Dept No");
		System.out.println("5. Mail");
		System.out.println("6. Password");
		System.out.println("------------------------------------------");
		Integer choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter your new name: ");
			emp.setEname(sc.next());
			break;
			
		case 2:
			System.out.print("Enter your new name: ");
			emp.setJob(sc.next());
			break;
			
		case 3:
			System.out.print("Enter your new name: ");
			emp.setSal(sc.nextDouble());
			break;
			
		case 4:
			System.out.print("Enter your new name: ");
			emp.setDno(sc.nextInt());
			break;
			
		case 5:
			System.out.print("Enter your new name: ");
			emp.setMail(sc.next());
			break;
			
		case 6:
			System.out.print("Enter your new name: ");
			emp.setPassword(sc.next());
			break;
		default:
			System.out.println("Enter a valid input");
		}
		
		edao.updateEmployee(emp);
		System.out.println("After Updating the data");
		System.out.println(emp);
		
	}

}
