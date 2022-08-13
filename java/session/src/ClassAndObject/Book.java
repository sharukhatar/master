//	Problem 2:Create a class Book which has following members:
//	private
//	private
//	private
//	private
//	int bookNo
//	String title
//	String author
//	float price
//	
//	
//	
//	Provide getter and setter methods for all the instance variables.
//	Provide appropriate constructors
//	Create method incrPrice(double percentage) for Book class
//	Create method displayBookDetails()
//	In main() method:
//	1. Create an object of the Book class.
//	2. Initialize the object by reading inputs for the fields from the user.
//	3. Call the incrPrice() method of Book class to increment price of book
//	4. Display details of book
package ClassAndObject;

import java.util.Scanner;

public class Book {
	private int bookNo;
	private String title, author;
	private float price;
	static Scanner sc = new Scanner(System.in);
	
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void incrPrice() {
		System.out.println("Increment % : ");
		float percentage = sc.nextFloat();
		System.out.println("bookNo :");
		int bookNo = sc.nextInt();
		
		if(this.bookNo == bookNo) {
			this.price = ((100+percentage)*this.price)/100;
			System.out.println("Price increased!");
		}
	}
	
	public void displayBookDetails(Book temp) {
		System.out.println("bookNo : "+temp.getBookNo());
		System.out.println("title : "+temp.getTitle());
		System.out.println("author : "+temp.getAuthor());
		System.out.println("price : "+temp.getPrice());
	}
	
	public static void main(String[] args) {
			
		System.out.println("bookNo : ");
		int bookNo = sc.nextInt();
		
		
		System.out.println("price : ");
		float price = sc.nextFloat();
		System.out.println();
		sc.nextLine();

		System.out.println("title : ");
		String title = sc.nextLine();
		System.out.println();
		sc.nextLine();
		
		System.out.println("author : ");
		String author = sc.nextLine();
		System.out.println();
		sc.nextLine();
		
		Book temp = new Book();
		temp.setBookNo(bookNo);
		temp.setTitle(title);
		temp.setAuthor(author);
		temp.setPrice(price);
		
		temp.displayBookDetails(temp);
		
		temp.incrPrice();
		
		temp.displayBookDetails(temp);
	}
}
