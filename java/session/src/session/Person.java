package session;

public class Person {

	int personId;
	String personName;
	
	public Person() {}
	
	public Person(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}
	
	public Person(int personId) {
		this.personId = personId;
		this.personName = "Unknown";
	}
	
	public String toString() {
		return "PersonId : "+ this.personId + "Person name : "+ this.personName;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person(101);
		System.out.println(p2);
		
		Person p3 = new Person(102, "Tushar");
		System.out.println(p3);
		
		
	}
}
