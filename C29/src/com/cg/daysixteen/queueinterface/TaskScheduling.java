package com.cg.daysixteen.queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

class Task implements Comparable<Task>{

	private String name;
	private int priority;
	
	public Task(String name, int priority) {
		//super();
		this.name = name;
		this.priority = priority;
	}
	
	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public int compareTo(Task o) {
		return Integer.compare(o.getPriority(), this.getPriority());
	}
}

public class TaskScheduling {
	public static void main(String[] args) {
		PriorityQueue<Task> tq = new PriorityQueue<Task>();
		
		//add task with different priority
		tq.add(new Task("Task 1", 3));
		tq.add(new Task("Task 2", 4));//high priority
		tq.add(new Task("Task 3", 1));//low priority
		tq.add(new Task("Task 4", 2));
		
		//process the task based on priority
		while(!tq.isEmpty()) {
			Task task = tq.poll();
			System.out.println("Processing: "+task.getName()
					+"Priority"+task.getPriority());
		}

	}

}
