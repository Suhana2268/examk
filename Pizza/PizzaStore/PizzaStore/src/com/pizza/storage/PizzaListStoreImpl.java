package com.pizza.storage;
import java.util.ArrayList;
import java.util.List;

import com.pizza.bean.Pizza;
import com.pizza.exception.NoPizzaFoundException;
import com.pizza.exception.PizzaAlreadyExists;

public class PizzaListStoreImpl implements PizzaStore {
	List<Pizza> PizzaList = new ArrayList<Pizza> ();

	@Override
	public void addNewPizza(Pizza e) throws PizzaAlreadyExists {
		
		int status = 0;
		for(Pizza p: PizzaList) {
			if(!(p.getPizzaName().equals(e.getPizzaName()))) {
				status += 1;
			}
		}
		if(status == PizzaList.size()) {
			PizzaList.add(e);
		}
		else {
			throw new PizzaAlreadyExists();
		}
		
		
	}

	@Override
	public Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundException {
		Pizza pz = null;
		for (Pizza p:PizzaList) {
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
		List<Pizza> bySize = new ArrayList<Pizza> ();
		for (Pizza p:PizzaList)
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
