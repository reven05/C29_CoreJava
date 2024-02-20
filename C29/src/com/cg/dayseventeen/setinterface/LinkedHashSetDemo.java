package com.cg.dayseventeen.setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// ordered, unsorted
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(40);
		lhs.add(60);
		lhs.add(20);
		lhs.add(30);
		lhs.add(70);
		lhs.add(50);
		lhs.add(null);//add null value
		System.out.println("Linked Hash Set: "+lhs);
		
		//LHS cannot be sorted
		//Collections.sort(lhs);
		
		//convert the LHS into ArrayList
		
		ArrayList<Integer> al = new ArrayList<>(lhs);
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("Sorted List: "+al);
	}

}
