package com.hsbc.day4Assignment.q2_6.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.hsbc.day4Assignment.q2_6.exception.EmployeeAlreadyExistException;
import com.hsbc.day4Assignment.q2_6.exception.EmployeeNotFoundException;
import com.hsbc.day4Assignment.q2_6.model.Employee;

public class StorageMapImpl implements Storage{
	
	static Map<Integer, Employee> employeeMap;
	
	static {
		employeeMap = new HashMap<>();
	}
	
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistException {
		
		int size = 0;
		employeeMap.put(e.getEmpId(), e);
		size = employeeMap.size();
		if(size > 0) {
			System.out.println("User created");
			System.out.println("HashMapppppp"+employeeMap);
		}
		else {
			throw new EmployeeAlreadyExistException();
		}
	}


	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee resultEmp = null;
		for(Entry<Integer, Employee>i : employeeMap.entrySet()) {
			if(i.getKey() == empNo) {
				resultEmp = i.getValue();
			}
		}
		if(resultEmp == null) {
			throw new EmployeeNotFoundException();
		}
		return resultEmp;
	}

}
