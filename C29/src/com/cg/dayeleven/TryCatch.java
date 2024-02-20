package com.cg.dayeleven;

public class TryCatch {
	
	int z;
	public void divide(int x, int y) {
		System.out.println("Inside Method");
		try {
			System.out.println("Inside Try, Before Exception");
			int z = x/y;
			System.out.println("Inside Try, After Exception");
			System.out.println("Z = "+z);
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
			System.out.println("Inside Catch Block");
		}
		System.out.println("End of program");
	}

}
