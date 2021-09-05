package com.pizza.view;

import java.util.List;
import java.util.Scanner;

import com.pizza.bean.Pizza;
import com.pizza.exception.NoPizzaFoundException;
import com.pizza.exception.PizzaAlreadyExists;
import com.pizza.storage.PizzaListStoreImpl;
import com.pizza.storage.PizzaStore;
import com.pizza.storage.PizzaStoreFactory;

public class CustomerView {
	Scanner sc = new Scanner(System.in);
	int code = sc.nextInt();
	PizzaStore dao = PizzaStoreFactory.getPizzaStorage(code);
	
	
	public void addPizzaDetailsAndStore(String pizzaName, int sizeInCms, String majorIngredientOne, String majorIngredientTwo,
			String majorIngredientThree, float weight, float price) throws PizzaAlreadyExists {
		dao.addNewPizza(new Pizza(pizzaName,sizeInCms,majorIngredientOne,majorIngredientTwo,majorIngredientThree,weight,price));
		
	}
	
	public Pizza displayPizzaDetailsByName(String name) throws NoPizzaFoundException {
		return dao.getPizzaByName(name);	
	}
	public List<Pizza> printPizzaNamesBySize(int Size) throws NoPizzaFoundException {
		return dao.getPizzaNamesBySize(Size);
	}
}
