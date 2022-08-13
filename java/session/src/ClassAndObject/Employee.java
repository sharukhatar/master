package ClassAndObject;

public class Employee {
	
	static int count = 100;
	int empId ,sal;
	String ename, desig;

	public Employee() {empId=++count;}

	public Employee(int sal, String ename, String desig) {
		empId=++count;
		this.sal = sal;
		this.ename = ename;
		this.desig = desig;
		//setId();
	}

	public Employee(String ename) {
		empId=++count;
		this.ename = ename;
	}
	
	public String toString() {
		return "Empl [empId=" + empId + ", sal=" + sal + ", ename=" + ename + ", desig=" + desig + "]";
	}
	
//	public void setId() {
//		this.empId=++count;
//		//System.out.println(Employee.empId+1);
//	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(40000, "Anita", "SSE");
		Employee e3 = new Employee("Kavita");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}

}