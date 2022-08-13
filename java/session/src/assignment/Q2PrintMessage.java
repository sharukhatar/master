package assignment;

import java.util.Scanner;

public class Q2PrintMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the message : ");
		String msg = sc.next();
		
		System.out.println("Enter number of times to print the message :");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println(msg);
		}
		sc.close();
	}

}
