package com.hsbc.day4Assignment.q2_6.storage;

import java.util.TreeSet;

import com.hsbc.day4Assignment.q2_6.exception.EmployeeAlreadyExistException;
import com.hsbc.day4Assignment.q2_6.exception.EmployeeNotFoundException;
import com.hsbc.day4Assignment.q2_6.model.Employee;

public class StorageSortedImpl implements Storage{
	
	
	static TreeSet<Employee> employeeTree = null;
	
	static {
		employeeTree = new TreeSet<>();
	}
	
	public void addEmployee(Employee e) throws EmployeeAlreadyExistException {
		int size = 0, status = 0;
		for(Employee emp : employeeTree) {
			if(emp.getEmpId() != e.getEmpId()) {
				status += 1;
			}
		}
			if(status == employeeTree.size()) {
					employeeTree.add(e);
					size = employeeTree.size();
					if(size > 0) {
						System.out.println("Employee added");
					}
					System.out.println(employeeTree+"Employee Tree");
			}
			else {
				throw new EmployeeAlreadyExistException();
			}
				
	}

	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee emp = null;
		for(Employee e: employeeTree) {
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
