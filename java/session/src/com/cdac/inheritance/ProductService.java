package com.cdac.inheritance;

public class ProductService extends Product {

	private int camera;

	public ProductService(int prodID, String prodName, int camera) {
		super(prodID, prodName);
		this.camera=camera ;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductService [camera=" + camera + "]";
	}
	
	
}
