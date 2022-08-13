package com.cdac.exception;

import com.cdac.exeption.InvalidDateException;

public class Date {
	
	private int date, month, year;
	
	public int getDate() {
		return date;
	}

	
	public void setDate(int date) throws InvalidDateException{
		if(date < 0 || date > 31)
			throw new InvalidDateException("You've entered invalid Date!");
			//System.out.println("Date is invalid");
		else
		  this.date = date;
	}

	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public Date(){}
	
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	
	public static void main(String[] args) {
		Date d1 = new Date();
		try {
			d1.setDate(32);
		} catch (InvalidDateException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}









