package com.cdac.inheritance;

public class WageEmp extends Emp1 {

	private int hrs , rate;
	
	//public WageEmp() {}
	
	public WageEmp(int id, String empName, int hrs, int rate) {
		super(id, empName);
		//super(): //java put this by default
		this.hrs = hrs;
		this.rate = rate;

	}
	
	public void displayWEDetails() {
		super.displayDetails();
		System.out.println("Wage Emp Sal : "+calcSalary());
	}
	
	public int calcSalary() {
		return this.hrs * this.rate;
	}
}
