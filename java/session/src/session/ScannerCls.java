package session;

import java.util.Scanner;

public class ScannerCls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2;
		
		
		System.out.println("Enter Name : ");
		String name = sc.next();
		
		System.out.println("Namaste "+name);
		System.out.println(num3);
		sc.close();
	}
}
