package com.cg.dayseven.overloading;

public class Person {
	private String personName;
	private int personAge;
	private String personCity;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public Person() {
		System.out.println("Default Constructor");
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, int personAge, String personCity) {
		System.out.println("Parameterized Constructor");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personCity=" + personCity + "]";
	}
}
