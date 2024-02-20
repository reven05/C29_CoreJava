package com.cg.daythree.package1;

public class Base {
	//variables of diff. access modifiers
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	//methods of diff. access modifiers
	void methodDefault() {
		System.out.println("Default Access base class");
		System.out.println(varDefault);
	}
	public void methodPublic() {
		System.out.println("Public Access base class");
		System.out.println(varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private Access base class");
		System.out.println(varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected Access base class");
		System.out.println(varProtected);
	}

}
