package session;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		
		s1+=" world";
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(3));
		
		s1.split(s1);
		System.out.println(s1);
		
	}
}
