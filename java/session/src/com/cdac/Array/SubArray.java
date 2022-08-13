package com.cdac.Array;

import java.util.Scanner;

public class SubArray {

	public static int[] subArr(int arr[],int start,int end) {
		int subArr[] = new int[(end-start+1)];
		int j = 0;

		for(int i=start; i<=end; i++){
			subArr[j] = arr[i];
			j++;
		}
		
		return subArr;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter startint [Index] : ");
		int start = sc.nextInt();
		
		System.out.print("Enter ending [Index] : ");
		int end = sc.nextInt();
		
		int subArr[] = subArr(arr,start,end);
		
		for(int element:subArr) {
			System.out.println("\nSubArray : "+element);
		}
		
		sc.close();
	}
}
