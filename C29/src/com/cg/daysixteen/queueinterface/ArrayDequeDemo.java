package com.cg.daysixteen.queueinterface;

import java.util.*;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		
		ad.add("A");
		ad.add("B");
		ad.add("C");
		ad.add("D");
		
		System.out.println(ad);
		//insert at first
		ad.offerFirst("F");
		System.out.println(ad);
		
		//alternate way to add element at last
		ad.offerLast("E");
		System.out.println(ad);
		
		//remove first element
		ad.removeFirst();
		System.out.println(ad);
		
		//remove the last element
		ad.removeLast();
		System.out.println(ad);
		
		System.out.println("Size: "+ad.size());

	}

}
