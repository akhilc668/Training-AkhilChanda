package com.set;

import java.util.LinkedHashSet;
import java.util.Iterator;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> ll=new LinkedHashSet<>();
		ll.add("Akhil");
		ll.add("Mahesh");
		ll.add("Banu");
		ll.add("Abhinay");
		ll.add("Nikhil");
		ll.add("Akhil");
		ll.add("Bunny");
		System.out.println(ll);	
		System.out.println(ll.size());//show the size of LinkedHashSet
		Iterator<String> i=ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether LinkedHashSet empty or not
		System.out.println(ll.contains("Banu"));//it checks whether the String is there in LinkedHashSet or not
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object
	}

}
