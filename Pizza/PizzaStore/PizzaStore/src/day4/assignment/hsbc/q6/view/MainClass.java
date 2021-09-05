package day4.assignment.hsbc.q6.view;

import java.util.Scanner;

import day4.assignment.hsbc.exceptions.InvalidInputException;
import day4.assignment.hsbc.invalidRangeExceptions.InvalidRangeException;
import day4.assignment.hsbc.q6.dataCollector.DataCollector;

public class MainClass {
	
	public static void main(String args[]) throws InvalidRangeException, InvalidInputException {
		
		DataCollector dc = new DataCollector();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter minimum and maximum values");
		int min = sc.nextInt();
		int max = sc.nextInt();
		System.out.println("Enter v1 and v2 values");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int result = dc.getResult(arr, min, max, v1, v2);
		System.out.println("The value is: "+result);
	}

}
