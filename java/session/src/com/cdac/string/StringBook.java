package com.cdac.string;

import java.util.Scanner;

public class StringBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Book Information = value, Use (;) to seperated values");
		String details = sc.nextLine();
		String[] returnDetails = details.split(";");
		for (String value : returnDetails) {
			System.out.println(value);
		}
		sc.close();
	}
}
