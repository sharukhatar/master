package com.cdac.exeption;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			Integer.parseInt("12a");
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3+" error"+ e.getMessage());
		}finally {
			System.out.println(4);
		}
		
	}
}
