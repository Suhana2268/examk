package com.day6Assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.day6Assignment.exception.ProductAlreadyExistsException;
import com.day6Assignment.exception.ProductNotAddedException;
import com.day6Assignment.model.Product;

public class ProductDaoImpl implements IProductDao{
	
	private static List<Product> products = new ArrayList<Product>();
	
	Connection con;
	PreparedStatement ps, ps1;
	
	
	/**
	 * 
	 */
	public ProductDaoImpl() {
		super();
		con = DatabaseUtil.con;
	}

	public boolean addProduct(Product p) throws SQLException, ProductAlreadyExistsException {
		// TODO Auto-generated method stub
		List<Product> products = getAllProducts();
		boolean status = false;
		int id = p.getProductId();
		int size = 0;
		for(Product prod: products) {
			if(prod.getProductId() == id) {
				size++;
			}
		}
		if(size == products.size()) {
			
			int productId = p.getProductId();
			String productName = p.getProductName();
			String description = p.getDescription();
			double price = p.getPrice();
			
			String query = "insert into products values(?,?,?,?)";
			
			ps = con.prepareStatement(query);
			ps.setInt(1, productId);
			ps.setString(2, productName);
			ps.setDouble(3, price);
			ps.setString(4, description);
			
			
			int i = ps.executeUpdate();
			if(i == 1) status = true;
		}
		else {
			throw new ProductAlreadyExistsException();
		}
		
		return status;
	
		
	}

	public boolean updateProduct(Product p) throws SQLException {
		// TODO Auto-generated method stub
		boolean status  = false;
		String query = "update products set productName =?,price = ?, description =? where productId =?";
		
		ps = con.prepareStatement(query);
		ps.setString(1, p.getProductName());
		ps.setDouble(2, p.getPrice());
		ps.setString(3, p.getDescription());
		ps.setInt(4, p.getProductId());
		
		int i = ps.executeUpdate();
		if(i == 1) status = true;
		
		return status;
		
		
		
	}

	public List<Product> getAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "select * from products";
		ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Product> pList = new ArrayList<Product>();
		
		while(rs.next()) {
			int productId = rs.getInt("productId");
			String productName = rs.getString("productName");
			String description = rs.getString("description");
			double price = rs.getDouble("price");
			
			pList.add(new Product(productId, productName, price, description));
		}
		return pList;
	}

	public List<Product> getProductsByPrice(double price) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from products where price = ?";
		ps = con.prepareStatement(query);
		ps.setDouble(1, price);
		ResultSet rs = ps.executeQuery();
		List<Product> pList = new ArrayList<Product>();
		
		while(rs.next()) {
			int productId = rs.getInt("productId");
			String productName = rs.getString("productName");
			String description = rs.getString("description");
			double price1 = rs.getDouble("price");
			
			pList.add(new Product(productId, productName, price1, description));
		}
		return pList;
	}

	public boolean addTwoProducts(Product p1, Product p2) throws SQLException, ProductNotAddedException {
		// TODO Auto-generated method stub
		
		
		
		boolean status = false;
		int productId1 = p1.getProductId();
		String productName1 = p1.getProductName();
		String description1 = p1.getDescription();
		double price1 = p1.getPrice();
		
		int productId2 = p2.getProductId();
		String productName2 = p2.getProductName();
		String description2 = p2.getDescription();
		double price2 = p2.getPrice();
		
		String query = "insert into products values(?,?,?,?)";
		String query1 = "insert into products values(?,?,?,?)";
		
		ps = con.prepareStatement(query);
		ps1 = con.prepareStatement(query1);
		
		ps.setInt(1, productId1);
		ps.setString(2, productName1);
		ps.setDouble(3, price1);
		ps.setString(4, description1);
		
		ps1.setInt(1, productId2);
		ps1.setString(2, productName2);
		ps1.setDouble(3, price2);
		ps1.setString(4, description2);
		
		int i = ps.executeUpdate();
		int j = ps1.executeUpdate();
		if(i == 1 && j == 1) status = true;
		else {
			throw new ProductNotAddedException();
		}
		
		return status;
		
		
	}

}
