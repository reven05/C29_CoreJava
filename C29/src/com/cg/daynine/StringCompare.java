package com.cg.daynine;

public class StringCompare {

	public static void main(String[] args) {
		//literals
		String s1 = "ECE";
		String s2 = "ECE";
		//new keyword
		String s3 = new String("ECE");
		String s4 = new String("ECE");
		
		//== and equals
		System.out.println("s1 == s2: "+(s1 == s2)+
				" s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 == s3: "+(s1 == s3)+
				" s1 equals s3: "+s1.equals(s3));
		System.out.println("s3 == s4: "+(s3 == s4)+
				" s3 equals s4: "+s3.equals(s4));
		
		System.out.println("S1:"+System.identityHashCode(s1));
		System.out.println("S2:"+System.identityHashCode(s2));
		System.out.println("S3:"+System.identityHashCode(s3));
		System.out.println("S4:"+System.identityHashCode(s4));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
	}

}
