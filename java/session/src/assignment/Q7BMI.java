// 7. WAP to accept weight of a person in kg and height in meters. Calculate BMI using the formula : bmi = kg/m 2

package assignment;

import java.util.Scanner;

public class Q7BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Weight in kg :");
		float weight = sc.nextFloat();
		
		System.out.println("Height in meters :");
		float height = sc.nextFloat();
		
		float bmi = weight/(height*height);
		
		System.out.println("BMI : "+bmi);
		
		if(bmi < 18.5f) {
			System.out.println("You're underweight!");
		}else if(bmi >= 18.5f && bmi <25.0f) {
			System.out.println("You're Normal!");
		}else if(25.0f <= bmi && bmi < 30.0f) {
			System.out.println("You're Overweight!");
		}else if(30<= bmi) {
			System.out.println("You're Obese!");
		}else {
			System.out.println("Please enter a valid Height and Weight");
		}
		
		sc.close();

	}

}
