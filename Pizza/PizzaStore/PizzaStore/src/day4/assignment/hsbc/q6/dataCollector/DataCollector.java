package day4.assignment.hsbc.q6.dataCollector;

import day4.assignment.hsbc.exceptions.InvalidInputException;
import day4.assignment.hsbc.invalidRangeExceptions.InvalidRangeException;
import day4.assignment.hsbc.q6.staticUtility.StaticUtility;

public class DataCollector {
	
	StaticUtility su = new StaticUtility();
	public int getResult(int data[], int min, int max, int v1, int v2) throws InvalidRangeException, InvalidInputException {
		int result = 0;
		try {
			int i = su.getAverageValue(data, min, max);
			result = (i*v1)/v2;
		}
		catch (Exception e) {
			throw new InvalidInputException();
		}
		return result;
		
	}
	
	

}
