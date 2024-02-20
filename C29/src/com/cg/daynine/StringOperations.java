package com.cg.daynine;

public class StringOperations {

	public static void main(String[] args) {
		//new  keyword
		String s = new String("    Indian    ..");
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.substring(4, 10));
		System.out.println(s.substring(4));
		System.out.println(s.strip());
		System.out.println(s.isEmpty());
		
	}

}
