// 6. W-A-Function that converts a Fahrenheit degree to Celsius using the formula celsius = (5.0/9 )(fahrenheit -
// 32).

package assignment;

import java.util.Scanner;

public class Q6FtoC {

	public static double fToC(double f) {
		return (5.0/9.0)*(f-32);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("F :");
		double fahrenheit = sc.nextDouble();
		
		double celsius = fToC(fahrenheit);
		System.out.println("Celsius : "+celsius);
		
		sc.close();

	}
}
