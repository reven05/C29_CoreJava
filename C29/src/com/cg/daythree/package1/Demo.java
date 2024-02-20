package com.cg.daythree.package1;

public class Demo {

	public static void main(String[] args) {
		//accessing from same package
		Base b = new Base();
		b.varDefault = 11;
		
		b.varPublic = 22;
		
		//b.varPrivate = 33;
		
		b.varProtected = 44;
		
		b.methodDefault();
		
		b.methodPublic();
		
		//b.varPrivate();
		
		b.methodProtected();
		
	}

}
