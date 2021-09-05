package com.pizza.storage;

import java.util.ArrayList;
import java.util.List;

import com.pizza.bean.Pizza;
import com.pizza.exception.NoPizzaFoundException;
import com.pizza.exception.PizzaAlreadyExists;

public class PizzaStoreImpl implements PizzaStore{
	
	Pizza pizzaArray[] = new Pizza[100];

	@Override
	public void addNewPizza(Pizza e) throws PizzaAlreadyExists {
		// TODO Auto-generated method stub
		
		int size = 0, status = 0;
		for(int i = 0; i < pizzaArray.length; i++) {
			if(pizzaArray[i] == null) {
				pizzaArray[i] = e;
				status = 1;
				break;
			}
		}
		if(status == 1) {
			System.out.println("Pizza Added\n----Showing Pizza Array-------\n"+e);
		}
		else {
			throw new PizzaAlreadyExists();
		}
	}

	@Override
	public Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException {
		// TODO Auto-generated method stub
		Pizza pz = null;
		for (Pizza p:pizzaArray) {
			if(p.getPizzaName().equals(pizzaname)){
				pz = p;
			}
	}
		if(pz != null) {
			return pz;
		}
		else {
			throw new NoPizzaFoundException();
		}
	}

	@Override
	public List<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException {
		// TODO Auto-generated method stub
		List<Pizza> bySize = new ArrayList<Pizza> ();
		for (Pizza p:pizzaArray)
			if(p.getSizeInCms() == size) {
				bySize.add(p);
			}
		if(bySize != null) {
			return bySize;
		}
		else {
			throw new NoPizzaFoundException();
		}
	}

}
