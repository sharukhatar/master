package com.cdac.string;

public class StrWeb {

	public String[] nameLength(String names[]) {
		int count = 0, i = 0;
		
		for(String name:names) {
			if(name.startsWith("www.")) {
				count++;
			}
		}
		
		String newNames[] = new String[count];
		for(String name:names) {
			if(name.startsWith("www.")) {
				newNames[i]=name;
				i++;
			}
		}
		return newNames;
		
	}
	public static void main(String[] args) {
		String[] names={"www.google.com","www.msn.com","www.amazon.com","www.coderanch.com", "in.answers.yahoo.com", "en.m.wikipedia.com", "codehs.gitbooks.io"};
		int count=0;
		StrWeb n1 = new StrWeb();
		String newNames[]= n1.nameLength(names);
		for(String name:newNames) {
			System.out.println(name);
			count++;
		}
		System.out.println("Website names start with [www] : "+count);	
	}
}
