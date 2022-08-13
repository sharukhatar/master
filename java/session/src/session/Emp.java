package session;

public class Emp {
	private int empId;
	private String empName;
	private Date doj;  // doj is of type Date 
		
	public Emp(int empId, String empName, Date doj) {
		this.empId = empId;
		this.empName = empName;
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", doj=" + doj + "]";
	}

	public static void main(String[] args) {
//		Date d1 = new Date(24,5,2020);
//		
//		Emp e1 = new Emp(101, "Adarsh", d1);// Composition / has a hierarchy
		
		Emp e1 = new Emp(101, "Adarsh", new Date(24,5,2020));// Composition / has a hierarchy
		System.out.println(e1.doj.Date);

		System.out.println(e1);
	}
}
