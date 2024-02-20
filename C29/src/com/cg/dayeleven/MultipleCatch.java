package com.cg.dayeleven;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Main Begins...");
		int a[] = {1,2,3,4,5};
		String c = "Hi Hello";
		try {
			int b = 45/7;
			System.out.println("B: "+b);
			System.out.println(a[4]);
			System.out.println(c.charAt(50));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
