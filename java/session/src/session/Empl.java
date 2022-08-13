
public class Empl {
	
	int empId, sal;
	String ename, desig;

	public Empl() {}

	public Empl(int sal, String ename, String desig) {
		this.sal = sal;
		this.ename = ename;
		this.desig = desig;
	}

	public Empl(String ename) {
		this.ename = ename;
	}
	
	public String toString() {
		return "Empl [empId=" + empId + ", sal=" + sal + ", ename=" + ename + ", desig=" + desig + "]";
	}

	public static void main(String[] args) {
		Empl e1 = new Empl();
		Empl e2 = new Empl(40000, "Anita", "SSE");
		Empl e3 = new Empl("Kavita");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}

}
