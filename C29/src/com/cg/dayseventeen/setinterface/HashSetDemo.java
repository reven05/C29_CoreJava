package com.cg.dayseventeen.setinterface;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(20);
		hs.add(30);
		hs.add(50);
		hs.add(60);
		hs.add(10);
		hs.add(40);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(40);
		hs2.add(80);
		hs2.add(12);
		hs2.add(10);
		hs2.add(50);
		hs2.add(22);
		
		System.out.println("Set 1: "+hs);
		System.out.println("Set 2: "+hs2);
		
		//Duplicate HashSet
		HashSet<Integer> dup = new HashSet<Integer>();
		dup.addAll(hs);
		
		System.out.println("Set Duplicate: "+dup);
		
		//Union of two Sets
		dup.addAll(hs2);
		System.out.println("Union Set: "+dup);

		dup.clear();
		dup.addAll(hs);
		
		//Intersection of two sets
		dup.retainAll(hs2);
		System.out.println("Result is : "+dup);
		
		dup.clear();
		dup.addAll(hs);
		
		//Difference of two sets
		dup.removeAll(hs2);
		System.out.println("Result is : "+dup);
		
	}

}
