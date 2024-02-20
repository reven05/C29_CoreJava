package com.cg.dayfifteen.builinobjects;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(12);
		ll.add(33);
		ll.add(10);
		ll.add(25);
		ll.add(15);
		ll.add(66);
		ll.add(19);
		ll.add(34);
		ll.addFirst(55);
		ll.addLast(44);
		ll.add(4, 88);
		ll.add(23);
		
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(5));
		
		Collections.sort(ll);
		
		System.out.println(ll);
		
		Collections.reverse(ll);
		
		System.out.println(ll);
		
		ListIterator<Integer> li = ll.listIterator();
		while(li.hasNext()) {
			int lv = li.next();
			System.out.println(lv);
		}
	}

}
