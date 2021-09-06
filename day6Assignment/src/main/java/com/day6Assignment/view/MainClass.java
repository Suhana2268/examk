package com.day6Assignment.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.day6Assignment.exception.ProductAlreadyExistsException;
import com.day6Assignment.exception.ProductNotAddedException;
import com.day6Assignment.factory.ServiceFactory;
import com.day6Assignment.model.Product;
import com.day6Assignment.service.IProductService;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String status="y";

		while(status.equals("y")) {	
			System.out.println("*****************Main Menu***************");
			System.out.println("press 1 to Create Product");
			System.out.println("press 2 to View All Products");
			System.out.println("press 3 to View All products by price");
			System.out.println("Press 4 to Add two products");
			System.out.println("Press 5 to Update product");
			
		
			System.out.println("Please Enter your choice");
			
			int choice=sc.nextInt();
			
			
			
			IProductService ip = ServiceFactory.createServiceObject();
			
			switch(choice) {
			case 1: 

				System.out.println("Enter product Id");
				int productId = sc.nextInt();
				System.out.println("Enter product name");
				String productName = sc.next();
				System.out.println("Enter product price");
				double price = sc.nextDouble();
				System.out.println("Enter product description");
				String description = sc.next();
				Product p = new Product(productId, productName, price, description);
				try {
					System.out.println(ip.addProduct(p));
				} catch (ProductAlreadyExistsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2: 
				System.out.println(ip.getAllProducts());
				break;
			case 3:
				System.out.println("Enter price");
				double price1 = sc.nextDouble();
				System.out.println(ip.getProductsByPrice(price1));
				break;
			case 4: 

				System.out.println("Enter product Id");
				int productId1 = sc.nextInt();
				System.out.println("Enter product name");
				String productName1 = sc.next();
				System.out.println("Enter product price");
				double price12 = sc.nextDouble();
				System.out.println("Enter product description");
				String description1 = sc.next();
				Product p1 = new Product(productId1, productName1, price12, description1);
				System.out.println("Enter product Id");
				int productId2 = sc.nextInt();
				System.out.println("Enter product name");
				String productName2 = sc.next();
				System.out.println("Enter product price");
				double price2 = sc.nextDouble();
				System.out.println("Enter product description");
				String description2 = sc.next();
				Product p2 = new Product(productId2, productName2, price2, description2);
				
				try {
					System.out.println(ip.addTwoProducts(p1, p2));
				} catch (ProductNotAddedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 5: 

				System.out.println("Enter product Id");
				int prodId = sc.nextInt();
				System.out.println("Enter product name");
				String prodName = sc.next();
				System.out.println("Enter product price");
				double prodPrice = sc.nextDouble();
				System.out.println("Enter product description");
				String prodDescription = sc.next();
				Product p3 = new Product(prodId, prodName, prodPrice, prodDescription);
				
				System.out.println(ip.updateProduct(p3));
				
				break;
			
				default: System.out.println("wrong choice");
			}
			System.out.println("Do you want to continue press y/n");
			status=sc.next();
		}

	}

}
