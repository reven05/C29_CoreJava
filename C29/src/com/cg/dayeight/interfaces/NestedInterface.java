package com.cg.dayeight.interfaces;

public interface NestedInterface {
	void calArea();
	interface InnerInterface{
		int id = 20;
		void print();
	}

}
