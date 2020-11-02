package com.set;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ll=new TreeSet<>();
		ll.add("Akhil");
		ll.add("Mahesh");
		ll.add("Banu");
		ll.add("Akhil");
		ll.add("Abhinay");
		ll.add("Nikhil");
		ll.add("Bunny");
		System.out.println(ll);	
		System.out.println(ll.first());//shows the first element.
		System.out.println(ll.last());//shows the last element.
		System.out.println(ll.lower("Mahesh"));//before the given string in accending order list
		System.out.println(ll.higher("Mahesh"));//after the given string in accending order list
		System.out.println(ll.size());//show the size of TreeSet
		System.out.println(ll.pollFirst());//it return the first element from list and remove from it
		System.out.println(ll.pollLast());//it return the last element from list and remove from it
		Iterator<String> i=ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether TreeSet empty or not
		System.out.println(ll.contains("Banu"));//it checks whether the String is there in TreeSet or not
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object

	}

}
