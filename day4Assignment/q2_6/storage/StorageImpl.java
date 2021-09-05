package com.hsbc.day4Assignment.q2_6.storage;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.day4Assignment.q2_6.exception.EmployeeAlreadyExistException;
import com.hsbc.day4Assignment.q2_6.exception.EmployeeNotFoundException;
import com.hsbc.day4Assignment.q2_6.model.Employee;

public class StorageImpl implements Storage{
	
	
	static List<Employee> empList = null;
	
	static {
		empList = new ArrayList();
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.hsbc.day4Assignment.q2.storage.Storage#addEmployee(com.hsbc.day4Assignment.q2.model.Employee)
	 * method for adding employee
	 */
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistException {
		int size = 0, status = 0;
		for(Employee emp : empList) {
			if(emp.getEmpId() != e.getEmpId()) {
				status += 1;
			}
		}
			if(status == empList.size()) {
					empList.add(e);
					size = empList.size();
					if(size > 0) {
						System.out.println("Employee added");
					}
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
		for(Employee e: empList) {
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
