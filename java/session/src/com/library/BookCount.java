package com.library;

public class BookCount extends Book{

	private static int count = 0;
	private static int bookCount;
	
	
	public BookCount() {
		super();
		getBookCount();
	}

	public BookCount(int bookNo, String title, String author, float price) {
		super(bookNo, title, author, price);
		getBookCount();
	}

	public static int getBookCount() {
		bookCount = ++count;
		return bookCount;
	}
	
	public static void main(String[] args) {
		//Book n1 = new BookCount(5, "War and Peace", "Leo Tostoy", 4f);
		System.out.println("Count : "+getBookCount());
		Book n2 = new BookCount(8, "Theory of Everything", "Stephen Hawkins", 3f);
		//System.out.println("Count : "+getBookCount());
	}
}
