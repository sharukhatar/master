package com.cdac.Array;

public class AboveAverage {

	public static void main(String[] args) {
		int sum = 0,avg = 0;
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int element:arr) {
			sum += element;
		}
		
		avg = sum / (arr.length);
		System.out.println("Average : "+avg);
		
		for(int element:arr)
		{
			if(element > avg) {
				System.out.print(element+"|");
			}
		}
	}
}
