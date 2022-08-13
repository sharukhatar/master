package com.library;

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
	public static void incrPrice(Book b[]) {
		System.out.print("Increment % : ");
		float percentage = sc.nextFloat();
		
		System.out.println("[1]incerease All books price\n[2]increase Specific book\n");
		int ans = sc.nextInt();
		
		if(ans == 1) {
			for(int i=0;i<3;i++) {
				b[i].price = (b[i].price * (percentage+100))/100;
				
			}
			displayBookDetails(b);
		}else if(ans == 2) {
			System.out.print("bookNo :");
			int bookNo = sc.nextInt();
			
			for(int i=0;i<3;i++) {
				if(b[i].bookNo == bookNo) {
					b[i].price = ((100+percentage)*b[i].price)/100;
					System.out.println("Price increased!\n");
					displayBookDetails(b);
				}else{
					System.out.println("Sorry!");
				}
			}
		}
	}
	
	public static void displayBookDetails(Book b[]) {
		for(int i=0;i<3;i++) {
			System.out.println("bookNo : "+b[i].getBookNo());
			System.out.println("title : "+b[i].getTitle());
			System.out.println("author : "+b[i].getAuthor());
			System.out.println("price : "+b[i].getPrice());
			System.out.println();
		}
	}
	
	public static void searchBook(Book[] b) {
		System.out.print("Enter book no. you wnat to search : ");
		int bookno = sc.nextInt();
		
		for(int i=0;i<3;i++) {
			if(bookno == b[i].getBookNo()) {
			System.out.println("\nFound successfully\n");
			}
		}
	}
	
	public static void main(String[] args) {
			
//		System.out.print("bookNo : ");
//		int bookNo = sc.nextInt();
//		
//		
//		System.out.print("price : ");
//		float price = sc.nextFloat();
//		sc.nextLine();
//
//		System.out.print("title : ");
//		String title = sc.nextLine();
//		
//		System.out.print("author : ");
//		String author = sc.nextLine();
//		
//		Book temp = new Book();
//		temp.setBookNo(bookNo);
//		temp.setTitle(title);
//		temp.setAuthor(author);
//		temp.setPrice(price);
//		
//		temp.displayBookDetails(temp);
//		System.out.println();
//		temp.incrPrice();
//		
//		temp.displayBookDetails(temp);
		
		Book b[] = new Book[3];
		
		for(int i=0;i<3;i++) {
			System.out.print("bookNo : ");
			int bookNo = sc.nextInt();
			
			System.out.print("price : ");
			float price = sc.nextFloat();
			sc.nextLine();

			System.out.print("title : ");
			String title = sc.nextLine();
			
			System.out.print("author : ");
			String author = sc.nextLine();
			
			b[i] = new Book(bookNo,title,author,price);
			System.out.println();
		}
		
		searchBook(b);
		incrPrice(b);
		
	}
}
