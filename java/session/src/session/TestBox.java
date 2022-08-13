package session;

public class TestBox {
	
	public static void main(String[] args) {
		Box b1 = new Box(1, 2, 3);
		// b1.length = 90;// this class is aam aadmi and he can't access the length directly
		
		System.out.println(b1.getLength());
		b1.setHeight(53);
		System.out.println(b1);
	}

}
