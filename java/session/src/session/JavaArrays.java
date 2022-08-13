package session;

public class JavaArrays {
	public static void main(String[] args) {
//		int arr1[]; // creates a reference to an array
//		
//		arr1 = new int[5];
		
		// 1st method for creating an array
		int arr1[] = new int[5];
		arr1[0] = 100;
		arr1[1] = 300;
		arr1[2] = 600;
		arr1[3] = 900;
		arr1[4] = 1200;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		for(int element : arr1) {
			System.out.println(element);
		}
		
		System.out.println();
		
		// 2nd method for creating an array
		int arr2[] = {1, 2, 3, 4, 5};
		
		for(int element : arr2) {
			System.out.println(element);
		}
		
		System.out.println();
		
		// Array of float
		float arr3[] = {1.2f, 3.4f, 25.5f, 7.9f};
		for(float val : arr3) {
			System.out.println(val);
		}
		
		System.out.println();
		
		// Character array
		char arr4[] = {'a', 'b', 'h', 'i', 's', 'h', 'e', 'k'};
		for(char ch : arr4) {
			System.out.println(ch);
		}
		System.out.println();
		
		// Array of Strings
		String names[] = {"Leekhil", "Vaibhav", "Kiran"};
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
	}

}
