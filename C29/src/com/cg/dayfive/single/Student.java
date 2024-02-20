//sub class or child class
package com.cg.dayfive.single;

public class Student extends Citizen {
	
	private int rollNo;
	private String collegeName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String collegeName, String name, String address, int phone) {
		super(name, address, phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", Address=" + getAddress() + ", Phone=" + getPhone() + "]";
	}
	
	
	
	
	
	
	

}
