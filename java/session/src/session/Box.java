package session;

public class Box {

	private int length, width, height;
	
//	public void displayDimention() {
//		System.out.println("Length : "+this.length);
//		System.out.println("Width : "+this.width);
//		System.out.println("Height : "+this.height);
//	}
	
//	public void setDim(int l, int w, int h) {
//		this.length = l;
//		this.width = w;
//		this.height = h;
//	}
	
	public Box() {
		
	}
	
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

//	public Box(int l, int w, int h) {
//		this.length = l;
//		this.width = w;
//		this.height = h;
//	}
	
	public void setLength(int newLength) {
		this.length = newLength;
	}
	
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int calcVolume() {
		int volume = 0;// local variable
		System.out.println(volume);
		volume = this.height * this.length * this.width;
		return volume;
	}
	
	public static void main(String[] args) {
		Box b1; // Creates an object reference
		b1 = new Box(3, 2, 1); // Creates actual object
		b1.toString();
//		b1.setDim(10, 20, 30);
		System.out.println();
		b1.toString();
		System.out.println();
		
		Box b2 = new Box(100, 150, 200);
		b2.toString();
		
		System.out.println("\nVolume is "+b2.calcVolume());
		
		System.out.println("\n"+b1.toString());
		
		b1.setLength(43);
		
		System.out.println("\n"+b1.toString());
		
		System.out.println("\nLength only : "+b1.getLength());
		
		Box bx1 = new Box(1,2,3);
		Box bx2 = new Box(12,23,34);
		Box bx3 = new Box(10, 20,30);
		
		bx1.setWidth(5);
		bx2.setHeight(50);
		bx3.getLength();
	}
	
}
