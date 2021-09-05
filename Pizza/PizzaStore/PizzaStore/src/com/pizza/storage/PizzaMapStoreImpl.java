package com.pizza.storage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.pizza.bean.Pizza;
import com.pizza.exception.NoPizzaFoundException;
import com.pizza.exception.PizzaAlreadyExists;

public class PizzaMapStoreImpl implements PizzaStore{
	
	Map<String, Pizza> pizzaMap = new HashMap<>();

	@Override
	public void addNewPizza(Pizza e) throws PizzaAlreadyExists {
		// TODO Auto-generated method stub
		int size = 0;
		pizzaMap.put(e.getPizzaName(), e);
		size = pizzaMap.size();
		if(size > 0) {
			System.out.println("Pizza added!\n----------Showing Hashmap--------\n"+e);
		}
		else {
			throw new PizzaAlreadyExists();
		}
		
	}

	@Override
	public Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		for(Entry<String, Pizza> p : pizzaMap.entrySet()) {
			if(p.getKey().equals(pizzaname)) {
				pizza = p.getValue();
			}
			
		}
		if(pizza == null) {
			throw new NoPizzaFoundException();
		}
		
		return pizza;
	}

	@Override
	public List<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException {
		// TODO Auto-generated method stub
		List<Pizza> pizzaList = null;
		for(Entry<String, Pizza> p : pizzaMap.entrySet()) {
			if(p.getValue().getSizeInCms() == size) {
				pizzaList.add(p.getValue());
			}
		}
		if(pizzaList == null) {
			throw new NoPizzaFoundException();
		}
		return pizzaList;
	}

}
