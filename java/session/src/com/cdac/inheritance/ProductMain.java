package com.cdac.inheritance;

public class ProductMain {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Apple");
		System.out.println(p1.toString());
		
		Product p2 = new ProductItem(2, "Samsung", "S20", 80000);
		System.out.println(p2.toString());
		
		Product p3 = new ProductService(3, "Sony", 60);
		System.out.println(p3.toString());
	}

}
