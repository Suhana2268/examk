package com.hsbc.day4Assignment.q2_6.view;

import java.util.Scanner;

import com.hsbc.day4Assignment.q2_6.exception.EmployeeAlreadyExistException;
import com.hsbc.day4Assignment.q2_6.exception.EmployeeNotFoundException;
import com.hsbc.day4Assignment.q2_6.exception.InvalidStorageTypeException;
import com.hsbc.day4Assignment.q2_6.model.Employee;
import com.hsbc.day4Assignment.q2_6.storage.Storage;
import com.hsbc.day4Assignment.q2_6.utility.StorageFactory;

public class UserUI {
	
	/*
	 * main() method
	 */
	
	public static void main(String args[]) throws InvalidStorageTypeException, EmployeeAlreadyExistException, EmployeeNotFoundException  {
		
		
		String status="y";

		while(status.equals("y")) {	
			System.out.println("*****************Main Menu***************");
			System.out.println("press 1 to Create Employee");
			System.out.println("press 2 to View employee by Employee Id");
			
			
			Scanner sc=new  Scanner(System.in);
			System.out.println("Please Enter your choice");
			
			int choice=sc.nextInt();
			
			
			
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter code for storage type: \n1.Array\n2.ArrayList\n3.TreeSet\n4.HashMap");
				int code = sc.nextInt();
				Storage s = StorageFactory.getStorage(code);
				System.out.println("Enter employee id");
				int empId = sc.nextInt();
				System.out.println("Enter employee name");
				String name = sc.next();
				System.out.println("Enter employee department");
				String department = sc.next();
				System.out.println("Enter employee salary");
				double salary = sc.nextDouble();
				
				
				
				Employee emp = new Employee(empId, name, department, salary, null);
				s.addEmployee(emp);
				
				break;
			case 2:
				System.out.println("Enter code for storage type: \n1.Array\n2.ArrayList\n3.TreeSet\n4.HashMap");
				code = sc.nextInt();
				s = StorageFactory.getStorage(code);
				System.out.println("Enter employee id for details");
				int empNo = sc.nextInt();
				Employee employee = s.getEmployee(empNo);
				System.out.println(employee);
				break;
				
				default:
					System.out.println("Wrong input! Please try again");

			}
			System.out.println("Do you want to continue press y/n");
			status=sc.next();
		
		}
		
	}
}
	

