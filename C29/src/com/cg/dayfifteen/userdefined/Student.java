//Student Entity
package com.cg.dayfifteen.userdefined;

public class Student {
	private String name;
	private int rollNo;
	private float per;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollNo, float per) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", per=" + per + "]";
	}
	
	
}
