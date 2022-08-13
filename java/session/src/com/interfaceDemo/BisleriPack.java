package com.interfaceDemo;

public class BisleriPack {

	String bottleType;
	int qty;
	
	public BisleriPack() {}
	
	public BisleriPack(String bottleType, int qty) {
		super();
		this.bottleType = bottleType;
		this.qty = qty;
	}
	
	public int calcTotalVol() {
		int totVol=0;
		if (this.bottleType.equals("SmallBottle")) {
			BisleriBottle b1 = new SmallBottle();
			totVol = b1.getVolume() * this.qty;
		}else if(this.bottleType.equals("MediumBottle")){
			BisleriBottle b1 = new MediumBottle();
			totVol = b1.getVolume() * this.qty;
		}else if(this.bottleType.equals("LargeBottle")){
			BisleriBottle b1 = new LargeBottle();
			totVol = b1.getVolume() * this.qty;
		}
		return totVol;
	}
	
	public float calcTotalPrice() {
		float totPrice=0;
		if (this.bottleType.equals("SmallBottle")) {
			BisleriBottle b1 = new SmallBottle();
			totPrice = (b1.getCost() * this.qty);
		}else if(this.bottleType.equals("MediumBottle")){
			BisleriBottle b1 = new MediumBottle();
			totPrice = (b1.getCost() * this.qty);
		}else if(this.bottleType.equals("LargeBottle")){
			BisleriBottle b1 = new LargeBottle();
			totPrice = (b1.getCost() * this.qty);
		}
		return totPrice;

	}
	
	public static void main(String[] args) {
		BisleriPack b1 = new BisleriPack("SmallBottle", 8);
		System.out.println(b1.calcTotalPrice());
		System.out.println(b1.calcTotalVol());
		
		BisleriPack b2 = new BisleriPack("MediumBottle", 15);
		System.out.println(b2.calcTotalPrice());
		System.out.println(b2.calcTotalVol());
		
		BisleriPack b3 = new BisleriPack("LargeBottle", 20);
		System.out.println(b3.calcTotalPrice());
		System.out.println(b3.calcTotalVol());
	}
}
