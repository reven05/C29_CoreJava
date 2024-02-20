package com.cg.dayfifteen.builinobjects;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Heterogeneous List
		List list1 = new ArrayList<>();
		
		System.out.println(list1);
		list1.add(12);
		list1.add(true);
		list1.add('A');
		list1.add(23.56);
		list1.add("C29");
		list1.add(true);
		list1.add(false);
		list1.add(12);
		list1.add(20);
		list1.add(44);
		
		System.out.println(list1);
		list1.remove(true);
		
		list1.clear();
		
		System.out.println(list1);
		
		//Homogeneous List by using Generic
		List<String> list2 = new ArrayList<String>();
		list2.add("Asha");
		list2.add("Arunachalam");
		list2.add("Subash");
		list2.add("Malathi");
		list2.add("Nicelin");
		list2.add("Perumal");
		
		//list2.add(true);    	CTE
		//list2.add(22);		CTE
		
		System.out.println(list2);
		
		Collections.reverse(list2);
		
		System.out.println("====Before Sorting====");
		System.out.println(list2);
		System.out.println("====After Sorting====");
		
		Collections.sort(list2);
		System.out.println("---Ascending Order---");
		System.out.println(list2);
		
		System.out.println("---Descending Order---");
		Collections.reverse(list2);
		System.out.println(list2);
		
		//Traversing a List
		System.out.println("+++++++++Traversing a List++++++++");
		ListIterator<String> i = list2.listIterator();
		while(i.hasNext()) {
			String lv = i.next();
			System.out.println(lv);
		}
		
		//Traversing a List Backward
		System.out.println("----Traversing a List Backward----");
		ListIterator<String> li = list2.listIterator(list2.size());
		while(li.hasPrevious()) {
			String lv = li.previous();
			System.out.println(lv);
		}
	}

}
