package com.iterator;

import java.util.ListIterator;
import java.util.LinkedList;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Akhil");
		ll.add("Mahesh");
		ll.add("Banu");
		ll.add("Abhinay");
		ll.add("Nikhil");
		ll.add("Bunny");
		ll.addFirst("Sai");
		ll.addLast("Krishna");
		ListIterator<String> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println("\n============================================");
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		System.out.println("\n==============================================");
				
	}

}
