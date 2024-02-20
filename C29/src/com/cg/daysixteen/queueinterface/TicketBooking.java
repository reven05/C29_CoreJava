package com.cg.daysixteen.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class TicketBooking {

	public static void main(String[] args) {
		Queue<String> tb = new LinkedList<>();
		
		//Customers arrives to the queue
		tb.add("Customer 1");
		tb.add("Customer 2");
		tb.add("Customer 3");
		tb.add("Customer 4");
		
		//provide tickets to the customer
		while(!tb.isEmpty()) {
			String customer = tb.poll();
			System.out.println("Ticket provided to "+customer);
		}
	}

}
