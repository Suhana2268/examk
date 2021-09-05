package com.hsbc.day4Assignment.q2_6.storage;

import com.hsbc.day4Assignment.q2_6.exception.EmployeeAlreadyExistException;
import com.hsbc.day4Assignment.q2_6.exception.EmployeeNotFoundException;
import com.hsbc.day4Assignment.q2_6.model.Employee;

public interface Storage {
	
	void addEmployee(Employee e) throws EmployeeAlreadyExistException;
	Employee getEmployee(int empNo) throws EmployeeNotFoundException;

}
