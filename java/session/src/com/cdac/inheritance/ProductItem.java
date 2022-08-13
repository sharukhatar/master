package com.cdac.inheritance;

public class ProductItem extends Product {
	
	private String model;
	private int price;
	
	//public ProductItem() {}
	
	public ProductItem(int prodID, String prodName, String model, int price) {
		super(prodID, prodName);
		this.model=model;
		this.price=price;	
	}

	@Override
	public String toString() {
		return super.toString()+"ProductItem [model=" + model + ", price=" + price + "]";
	}

}
