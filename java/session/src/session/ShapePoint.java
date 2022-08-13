package session;

public class ShapePoint extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw point...");
	}
	
	public static void main(String[] args) {
		ShapePoint p = new ShapePoint();
		p.draw();
	}

}
