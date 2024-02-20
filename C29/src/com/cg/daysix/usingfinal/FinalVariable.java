package com.cg.daysix.usingfinal;

public class FinalVariable {
	
	//final int a;//final instance variable must be initialized
	int a;
	
	//final variables
	final int b = 23;
	final int c = 32;
	
	//static final variable
	final static int d = 44;
	final static int E;
	final int F;
	
	void change() {
		a = 5;
		 
		//E = 55;
		//d = 44;
		//final variable cannot be re-assigned 
		/* b = 22;
		c = 33;
		d = 55;
		 */		
	}
	
	//Constructor
	public FinalVariable() {
		//b = 22;
		//c = 33;
		//d = 55;
		F = 66;
		
	}
	static {
		//b = 22;
		//c = 33;
		E = 55;
	}
	

}
