package com.cdac.string;

public class Str {

	public String[] nameLength(String names[]) {
		int count = 0, i = 0;
		
		for(String name : names) {
			if(name.length() >= 4) {
				count++;
			}
		}
		String newNames[] = new String[count];
		for(String name:names) {
			if(name.length() >= 4) {
				newNames[i] = name;
				i++;
			}
		}
		return newNames;
	}
	
	public static void main(String[] args) {
		String[] names = {"John", "Siddhesh", "Adarsh", "Xi", "Joy"};
		Str s1 = new Str();
		String newNames[] = s1.nameLength(names);
		for(String name : newNames) {
			System.out.println(name);
		}
	}
}
