package com.cg.dayeight.interfaces;

public class ClassOne extends DemoClass implements ChildInterface{

	@Override
	public void print() {
		System.out.println("Print Method");
	}

	@Override
	public void show() {
		System.out.println("Show Method");
	}

}
