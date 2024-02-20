package com.cg.daytwo;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		/*
		 * 0 1 2 3 4 
		 * 0 1 2 3 4
		 * 0 1 2 3 4 
		 * 0 1 2 3 4
		 * 0 1 2 3 4
		 */
	}

}
