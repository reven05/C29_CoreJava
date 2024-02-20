package com.cg.daytwelve;

public class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super("Invalid Age");
	}
	public InvalidAgeException(String message) {
		super(message);
	}

}
