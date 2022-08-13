package assignment;

import java.util.Scanner;

public class Q4MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter table number to print :");
		int num = sc.nextInt();
		
		for(int count=1; count<11; count++) {
			System.out.println(num+" * "+count+" = "+(count*num));
		}
		sc.close();

	}

}