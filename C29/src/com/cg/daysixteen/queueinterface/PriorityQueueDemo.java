package com.cg.daysixteen.queueinterface;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("Java");
		pq.add("Spring");
		pq.add("Hibernate");
		pq.add("HTML");
		pq.add("React");
		
		System.out.println(pq);
		
		pq.remove();
		
		System.out.println(pq);
		
		pq.remove("React");
		
		System.out.println(pq);
		
		System.out.println("Poll Method: "+pq.poll());

	}

}
