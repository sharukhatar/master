package session;

public class HelloWorld {

	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = new String("Hello");
//		
//		int arr[] = new int[3];
//		int arr1[] = {1,2,3};


		HelloWorld hw = new HelloWorld();
		System.out.println(hw.add(5,8));
	}
}
