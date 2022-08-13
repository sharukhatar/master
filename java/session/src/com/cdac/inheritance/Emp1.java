package com.cdac.inheritance;

public class Emp1 {

	private int empId;
	private String empName;
	
	protected Emp1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public Emp1() {}

	public int calcSalary() {
		return 0;
	}
	
	public void displayDetails() {
		System.out.println("Emp1 [empId=" + empId + ", empName=" + empName + "]");
	}
	
}
