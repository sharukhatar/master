package com.cdac.Array;

public class EvenElements {

	public static void evenElements(int arr[]) {
		
		for(int element : arr) {
			if(element % 2 == 0) {
				System.out.println(element);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		evenElements(arr);
		
	}
	
}
