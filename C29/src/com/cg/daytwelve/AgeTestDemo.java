package com.cg.daytwelve;

import java.util.Scanner;

public class AgeTestDemo {
	static void validate(int age) throws InvalidAgeException{
		if(age< 18) {
			throw new InvalidAgeException("Not eligible to Vote!!!");
		}
		else {
			System.out.println("Welcome to Vote!!!");
		}
	}

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age = sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
