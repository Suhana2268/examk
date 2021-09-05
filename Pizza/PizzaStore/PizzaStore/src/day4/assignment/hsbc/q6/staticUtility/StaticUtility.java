package day4.assignment.hsbc.q6.staticUtility;

import day4.assignment.hsbc.invalidRangeExceptions.InvalidRangeException;

public class StaticUtility {

	public int getAverageValue(int data[], int min, int max) throws InvalidRangeException {
		int average = 0,sum = 0;
			for(int i = 0; i < data.length; i++) {
				sum += data[i];
		}
			average = sum/data.length;
				if(average >= min && average <= max) {
					return average;
				}
				else {
					throw new InvalidRangeException();
				}
	}
}
