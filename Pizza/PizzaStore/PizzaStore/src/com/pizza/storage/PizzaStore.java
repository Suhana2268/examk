package com.pizza.storage;

import java.util.List;

import com.pizza.bean.Pizza;
import com.pizza.exception.NoPizzaFoundException;
import com.pizza.exception.PizzaAlreadyExists;

public interface PizzaStore {
	void addNewPizza(Pizza e) throws PizzaAlreadyExists;
	Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException;
	List<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException;
	
}
