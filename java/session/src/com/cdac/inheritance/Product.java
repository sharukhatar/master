package com.cdac.inheritance;

public class Product {
	
	private int prodID;
	private String prodName;
	
	//public Product() {}
	
	public Product(int prodID, String prodName) {
		this.prodID = prodID;
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", prodName=" + prodName + "]";
	}
	
	

}
