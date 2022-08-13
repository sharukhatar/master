package assignment;

import java.util.Scanner;

public class Q3EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		for(int count=1; count<=num; count++) {
			if(count % 2 == 0) {
				System.out.println("=> "+count);
			}
		}
		sc.close();
	}
}
