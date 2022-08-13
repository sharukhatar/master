package com.cdac.exeption;

public class Demo {

	public static void main(String[] args) {
//		String s1 = null;
//		
//		System.out.println(s1.length());
		
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
		//at com.cdac.exeption.Demo.main(Demo.java:8)
		
		//Error aa jata hai
		
//		int arr[] = {1, 2,3,4,5};
//		//robust code kaise banaye
//		
//		if(s1!=null) {
//			System.out.println(arr[5]);
//		}
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
		//at com.cdac.exeption.Demo.main(Demo.java:8)

		int a = args.length;
		
		int b = 10/a;
	}
}
