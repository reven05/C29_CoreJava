package com.cg.dayeleven;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			System.out.println("I am Try Block");
			int a = 65/0;
			System.out.println("A: "+a);
		}catch(Exception e) {
			System.out.println("I am Catch Block");
			System.err.println(e.getMessage());
		}finally {
			System.out.println("I am Finally Block");
		}
	}

}
