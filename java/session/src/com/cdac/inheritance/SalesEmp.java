package com.cdac.inheritance;

public class SalesEmp extends WageEmp {

	private int commision;

	public SalesEmp(int id, String empName, int hrs, int rate, int commision) {
		super(id, empName, hrs, rate);
		this.commision = commision;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Comm : "+ this.commision);
	}
	
	public int calcSalary() {
		return super.calcSalary() + this.commision;
	}
	
	
}
