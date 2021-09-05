package com.hsbc.day4Assignment.q5.module;

import com.hsbc.day4Assignment.q3.AgeValidator.InvalidAgeException;
import com.hsbc.day4Assignment.q4.inputValidator.WrongInputException;


public class LearningModule {
	
	public String getLearningCode(String name, int age) throws WrongInputException{
		String learningCode = null;
		try {
			String ageOutput = getAgeCode(age);
			learningCode += name+"_"+age;
			return learningCode;
		}
		catch (InvalidAgeException e) {
			throw new WrongInputException();
		}
			
		}
		
	
	public String getAgeCode(int age) throws InvalidAgeException {
			if(age > 18) {
				return "Adult";
			}
			else if(age > 0 && age <= 18) {
				return "Child";
			}
			else {
				throw new InvalidAgeException();
			}
	}

}
