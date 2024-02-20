package com.cg.dayeleven;

public class NestedTry {
	public static int divide(int x, int y) {
		int z = 0;
		z = x/y;
		System.out.println("Result : "+z);
		return z;
	}

	public static void main(String[] args) {
		System.out.println("Main Begins...");
		int a[] = {1,2,3,4,5};
		try {
			System.out.println(a[8]);
			try {
				divide(33,2);
			}catch(Exception e) {
				System.out.println("Divided by Zero");
			}
		}catch(Exception e) {
			System.out.println("No value founded in the given index");
		}
		System.out.println("Main Ends...");
	}

}
