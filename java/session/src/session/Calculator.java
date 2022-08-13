package session;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public String add(String a, String b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		
		System.out.println(c.add("aaa", "bbb"));
		System.out.println(c.add(1.0f, 2.5f));
		System.out.println(c.add(1,2));
		System.out.println(c.add(1,2,3));
	}

}
