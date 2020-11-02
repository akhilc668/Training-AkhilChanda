package com.set;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> ll=new HashSet<>();
		ll.add("Akhil");
		ll.add("Mahesh");
		ll.add("Banu");
		ll.add("Abhinay");
		ll.add("Akhil");
		ll.add("Nikhil");
		ll.add("Bunny");
		System.out.println(ll);	
		System.out.println(ll.size());//show the size of HashSet
		Iterator<String> i=ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether HashSet empty or not
		System.out.println(ll.contains("Banu"));//it checks whether the String is there in HashSet or not
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object

	}

}
