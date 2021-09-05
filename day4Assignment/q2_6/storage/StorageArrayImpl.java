package com.hsbc.day4Assignment.q2_6.storage;

import com.hsbc.day4Assignment.q2_6.exception.EmployeeAlreadyExistException;
import com.hsbc.day4Assignment.q2_6.exception.EmployeeNotFoundException;
import com.hsbc.day4Assignment.q2_6.model.Employee;

public class StorageArrayImpl implements Storage{
	
	
static Employee empArray[] = null;
	
	static {
		empArray = new Employee[100];
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.hsbc.day4Assignment.q2.storage.Storage#addEmployee(com.hsbc.day4Assignment.q2.model.Employee)
	 * method for adding employee
	 */
	
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistException {
		int size = 0, status = 0;
	
		for(int i = 0; i < empArray.length; i++) {
			if(empArray[i] == null) {
				empArray[i] = e;
				status = 1;
				break;
			}
		}
			if(status == 1) {
				System.out.println("Profile created");
			}
			else {
				throw new EmployeeAlreadyExistException();
			}
				
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.hsbc.day4Assignment.q2.storage.Storage#getEmployee(int)
	 * method for fetching employee based on employee number
	 */

	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		Employee emp = null;
		for(Employee e: empArray) {
			if(e != null) {
				if(e.getEmpId() == empNo) {
					emp = e;
				}
			}
		}
		if(emp != null) {
			return emp;
		}
		else {
			throw new EmployeeNotFoundException();
		}
	}
	
	

}
