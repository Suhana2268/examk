package com.day6Assignment.factory;

import com.day6Assignment.dao.IProductDao;
import com.day6Assignment.dao.ProductDaoImpl;

public class DAOFactory {
	
	private DAOFactory() {
		
	}
	
	public static IProductDao createDaoObject() {
		return new ProductDaoImpl();
	}

}
