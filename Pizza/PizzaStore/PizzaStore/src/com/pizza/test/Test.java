package com.pizza.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pizza.bean.Pizza;
import com.pizza.exception.NoPizzaFoundException;
import com.pizza.exception.PizzaAlreadyExists;
import com.pizza.view.CustomerView;

public class Test {
	public static void main(String[] args) throws PizzaAlreadyExists, NoPizzaFoundException {
		Scanner sc = new Scanner(System.in);
		Pizza p = new Pizza();
		List<Pizza> PizzaList = new ArrayList<Pizza> ();
		CustomerView customerView = new CustomerView();
		for (int i = 0;i<1;i++) {
		customerView.addPizzaDetailsAndStore(sc.next().toLowerCase(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextFloat(),sc.nextFloat());
		}
		p = customerView.displayPizzaDetailsByName(sc.next().toLowerCase());
		System.out.println(p.toString());
		
		PizzaList = customerView.printPizzaNamesBySize(sc.nextInt());
		for (Pizza pa : PizzaList) {
			System.out.println(pa.toString());
		}
		
	}
}
