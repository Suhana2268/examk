package com.day6Assignment.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.day6Assignment.dao.IProductDao;
import com.day6Assignment.exception.ProductAlreadyExistsException;
import com.day6Assignment.exception.ProductNotAddedException;
import com.day6Assignment.factory.DAOFactory;
import com.day6Assignment.model.Product;

public class ProductServiceImpl implements IProductService{
	
	IProductDao pDao;
	public ProductServiceImpl() {
		pDao = DAOFactory.createDaoObject();
		
	}

	public Product addProduct(Product p) throws SQLException, ProductAlreadyExistsException {
		// TODO Auto-generated method stub
		boolean b = pDao.addProduct(p);
		if(b) {
			return p;
		}
		return null;
	}

	public List<Product> getAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		List<Product> pList = pDao.getAllProducts();
		if(pList != null) {
			return pList;
		}
		return null;
	}

	public List<Product> getProductsByPrice(double price) throws SQLException {
		// TODO Auto-generated method stub
		List<Product> pList = pDao.getProductsByPrice(price);
		if(pList != null) {
			return pList;
		}
		return null;
	}

	public List<Product> addTwoProducts(Product p1, Product p2) throws SQLException, ProductNotAddedException {
		// TODO Auto-generated method stub
		List<Product> proList = null;
		proList.add(p1);
		proList.add(p2);
		boolean b = pDao.addTwoProducts(p1, p2);
		
		if(b) {
			return proList;
		}
		return null;
	}

	public Product updateProduct(Product p) throws SQLException {
		// TODO Auto-generated method stub
		boolean st = pDao.updateProduct(p);
		if(st) {
			return p;
		}
		return null;
	}

}
