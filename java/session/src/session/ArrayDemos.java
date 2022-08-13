package session;

public class ArrayDemos {
	
	public static void main(String[] args) {
		//String sarr[] = new String[5];
		
		//String names[] = {"aaa","bbb","ccc"};// new not used
		
		Person[] parr = new Person[3];
		
		Person p1 = new Person(1,"aaa");
		Person p2 = new Person(2,"bbb");
		Person p3 = new Person(3,"ccc");
		
		parr[0] = p1;
		parr[1] = p2;
		parr[2] = p3;
		
		for(Person p : parr) {
			System.out.println(p);
		}
	}
	
}
