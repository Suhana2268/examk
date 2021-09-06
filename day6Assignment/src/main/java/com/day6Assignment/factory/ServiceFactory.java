package com.day6Assignment.factory;

import com.day6Assignment.service.IProductService;
import com.day6Assignment.service.ProductServiceImpl;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}
	
	public static IProductService createServiceObject() {
		return new ProductServiceImpl();
	}

}
