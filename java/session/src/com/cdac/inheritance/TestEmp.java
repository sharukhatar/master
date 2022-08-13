package com.cdac.inheritance;

public class TestEmp{
	public static void main(String[] args) {
//		WageEmp we1 = new WageEmp(101, "Siddesh", 80, 500);
//		SalesEmp se1 = new SalesEmp(102, "Sharukh", 100, 600, 10000);
//		
//		we1.displayWEDetails();
//		se1.calcSalary();
//		se1.displayWEDetails();
//		System.out.println(se1.calcSalary());

		Emp1 e1 = new Emp1(1, "aaa");
		Emp1 e2 = new WageEmp(2, "bbbb", 10, 2000);
		Emp1 e3 = new SalesEmp(3, "ccccc", 20, 1500, 5000);
	
	}
}
