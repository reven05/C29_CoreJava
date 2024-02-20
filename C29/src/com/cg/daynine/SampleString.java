package com.cg.daynine;

public class SampleString {

	public static void main(String[] args) {
		//Simple String - Char[]
		char c[] = {'I','N','D','I','A'};
		String s1 = new String(c);
		System.out.println(s1);
		
		//String Literals
		String s2 = "INDIA";
		System.out.println(s2);
		
		//+ Operator
		int a = 5, b = 6;
		System.out.println(a+b);
		//Concatenation
		System.out.println(s1 + s2);
		
	}

}
