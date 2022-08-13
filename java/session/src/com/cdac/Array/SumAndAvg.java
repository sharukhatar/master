package com.cdac.Array;

public class SumAndAvg {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int sum = 0, count = 0;
		float avg;
		
		for(int element:arr) {
			System.out.println(element);
		}
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			count++;
		}
		
		avg = sum / count;
		
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}
	
}
