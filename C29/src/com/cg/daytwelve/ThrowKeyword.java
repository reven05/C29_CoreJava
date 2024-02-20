package com.cg.daytwelve;

import java.util.Scanner;

public class ThrowKeyword {
	int acceptNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public static void main(String[] args) {
		int per;
		ThrowKeyword tk = new ThrowKeyword();
		System.out.println("Enter the Percentage:");
		per = tk.acceptNumber();
		try {
			if(per < 0) {
				throw new ArithmeticException("Percentage Should not be negative");
			}
			else if (per > 100) {
				throw new ArithmeticException("Percentage should not be more than 100");
			}
			else {
				System.out.println("Percentage is: "+per);
			}
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}

}
