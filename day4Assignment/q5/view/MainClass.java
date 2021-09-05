package com.hsbc.day4Assignment.q5.view;

import java.util.Scanner;

import com.hsbc.day4Assignment.q3.AgeValidator.InvalidAgeException;
import com.hsbc.day4Assignment.q4.inputValidator.WrongInputException;
import com.hsbc.day4Assignment.q5.module.LearningModule;

public class MainClass {
	
	public static void main(String args[]) throws WrongInputException, InvalidAgeException  {
		
		Scanner sc = new Scanner(System.in);
		
		LearningModule lm = new LearningModule();
		
		System.out.println("Enter your age for age code");
		int age = sc.nextInt();
		System.out.println("Enter your name for subject code");
		String name = sc.next();
		String learningCode = lm.getLearningCode(name, age);
		System.out.println("Your learning code is: "+learningCode);
	}

}
