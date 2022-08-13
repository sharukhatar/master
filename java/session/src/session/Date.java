package session;

import java.util.Scanner;

public class Date {
	public int Date, Month, Year;

	public Date(int date, int month, int year) {
		super();
		if(date < 31 && date > 1) {
			this.Date = date;
		}else{
			System.out.println("Not a valid date!");
		}
		
		if(month < 12 && month > 1) {
			this.Month = month;
		}else {
			System.out.println("Not a valid Month");
		}
		
		if(year > 1984 && year <= 2022) {
			this.Year = year;
		}else {
			System.out.println("Not a valid year!");
		}
	}

	@Override
	public String toString() {
		return "P1Date [Date=" + Date + ", Month=" + Month + ", Year=" + Year + "]";
	}

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		if(date < 31 && date > 1) {
			this.Date = date;
		}else{
			System.out.println("Not a valid date!");
		}
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		if(month < 12 && month > 1) {
			this.Month = month;
		}else {
			System.out.println("Not a valid Month");
		}
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		if(year > 1984 && year <=2022) {
			this.Year = year;
		}else {
			System.out.println("Not a valid year!");
		}
	}
	
//	public void validateDate() {
//		if(Date < 31 && Date > 1) {
//			if(Month <12 && Month > 1) {
//				if(Year > 1984 && Year <2022) {
//					System.out.println("Its a Date!");
//				}
//			}
//		}
//	}
	
	public static void main(String[] args) {
		Date d1 = new Date(20,05,2022);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Date :");
		int d = sc.nextInt();
		d1.setDate(d);
		System.out.println(d1);
		
		System.out.println("Month :");
		int m = sc.nextInt();
		d1.setMonth(m);
		System.out.println(d1);
		
		System.out.println("Year :");
		int y = sc.nextInt();
		d1.setYear(y);
		System.out.println(d1);
		
		sc.close();
				
	}

}
