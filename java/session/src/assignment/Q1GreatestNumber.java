package assignment;

import java.util.Scanner;

public class Q1GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter number 3 : ");
		int num3 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0 && num3 > 0) {
			if(num1 > num2 && num1 > num3) {
				System.out.println(num1+" is the gratest");
			}else if(num2 > num1 && num2 > num3) {
				System.out.println(num2+" is the greatest");
			}else {
				System.out.println(num3+" is the greatest");
			}
		}else {
			System.out.println("Please enter a positive integer");
		}
		sc.close();

	}

}
