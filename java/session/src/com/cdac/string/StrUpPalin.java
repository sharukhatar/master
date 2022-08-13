package com.cdac.string;

import java.util.Scanner;

public class StrUpPalin {

	public void validate(String str){
	    int flag = 0;
	    
	    System.out.println("String Length : "+(str.length()));
	    System.out.println("String [UpperCase] : "+(str.toUpperCase()));
	    
	    String revStr = str;
	    
	    int length = str.length();
		
	    for(int i=0; i<length; i++){
			if(str.charAt(i) != revStr.charAt(length - i - 1)){
				flag = 1;
			}
				
		}
		
	    if(flag == 1) {
			 System.out.println(str+" is not a Palindrome");
		} else {
			 System.out.println(str+" is a Palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter String");
	    String str = sc.next();
	    
	    StrUpPalin m1 = new StrUpPalin();
	    m1.validate(str);
	    
	    sc.close();
    }
}
