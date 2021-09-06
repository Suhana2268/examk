package com.day6Assignment.dao;

import java.sql.SQLException;
import java.util.List;

import com.day6Assignment.exception.ProductAlreadyExistsException;
import com.day6Assignment.exception.ProductNotAddedException;
import com.day6Assignment.model.Product;

public interface IProductDao {
	
	boolean addProduct(Product p) throws SQLException, ProductAlreadyExistsException;
	boolean updateProduct(Product p) throws SQLException;
	List<Product> getAllProducts() throws SQLException;
	List<Product> getProductsByPrice(double price) throws SQLException;
	boolean addTwoProducts(Product p1, Product p2) throws SQLException, ProductNotAddedException;
	

}
