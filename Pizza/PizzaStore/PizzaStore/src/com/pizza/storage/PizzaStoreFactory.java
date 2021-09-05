package com.pizza.storage;

public class PizzaStoreFactory {
	public static PizzaStore getPizzaStorage(int code) {
		
		if(code == 1) {
			return new PizzaStoreImpl();
		}
		else if(code == 2) {
			return new PizzaListStoreImpl();
		}
		else if(code == 3) {
			return new PizzaSortedStoreImpl();
		}
		else {
			return new PizzaMapStoreImpl();
		}
		
	}
}
