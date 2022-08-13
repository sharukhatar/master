package session;

public class PointCircle extends ShapePoint{
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle...");
	}
	
	public static void main(String[] args) {
		Shape s1 = new ShapePoint();
		s1.draw();
		
		Shape s2 = new PointCircle();
		s2.draw();
		
	}
	
}
