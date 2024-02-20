package com.cg.daysixteen.queueinterface;

import java.util.*;

public class QueueLinkedList {

	public static void main(String[] args) {
		//List ll = new LinkedList<>();
		
		Queue<Integer> ll = new LinkedList<>();
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		//add elements (0, 1, 2, 3, 4, 5) to the queue
		
		for(int i=0; i<=5; i++) {
			ll.add(i);
		}
		
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		
		//to remove head element
		ll.remove();
		
		System.out.println(ll);
		
		//to print head element without removing
		System.out.println("Head Element is: "+ll.peek());
		
		//to check the size
		System.out.println("Size of the Queue is: "+ll.size());
		
		//methods of collections
		//methods of iterator
		

	}

}
