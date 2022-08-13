// 5. Write a program that accepts two numbers and a operator like (+,-,*, /) and perform the appropriate
//    operation indicated by the operator.

package assignment;

import java.util.Scanner;

public class Q5Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number2 :");
		int num2 = sc.nextInt();
		
		System.out.println("Operator to perform :");
		String opr = sc.next();
		
		switch(opr) {
			case "+":
				System.out.println("Sum is : "+(num1+num2));
				break;
			case "-":
				System.out.println("Sub is : "+(num1-num2));
				break;
			case "*":
				System.out.println("Mul is : "+(num1*num2));
				break;
			case "/":
				System.out.println("Div is : "+(num1/num2));
				break;
			default:
				System.out.println("Invalid");
		}
		sc.close();

	}

}
