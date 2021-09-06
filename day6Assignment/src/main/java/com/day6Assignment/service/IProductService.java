package com.day6Assignment.service;

import java.sql.SQLException;
import java.util.List;

import com.day6Assignment.exception.ProductAlreadyExistsException;
import com.day6Assignment.exception.ProductNotAddedException;
import com.day6Assignment.model.Product;

public interface IProductService {
	
	Product addProduct(Product p) throws SQLException, ProductAlreadyExistsException;
	List<Product> getAllProducts() throws SQLException;
	List<Product> getProductsByPrice(double price) throws SQLException;
	List<Product> addTwoProducts(Product p1, Product p2) throws SQLException, ProductNotAddedException;
	Product updateProduct(Product p) throws SQLException;
}
