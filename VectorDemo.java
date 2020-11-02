package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> ll=new Vector<>();
		ll.add("Akhil");
		ll.add("Mahesh");
		ll.add("Banu");
		ll.add("Abhinay");
		ll.add("Nikhil");
		ll.add("Bunny");
		System.out.println(ll);
		System.out.println(ll.get(3));//gets the value of index
		System.out.println(ll.firstElement());//gets the first value of list
		System.out.println(ll.lastElement());//gets the last value of lis
		ll.set(4, "Srinivas");//replace of the index
		ll.insertElementAt("sai", 5);//insert in the particular index
		System.out.println(ll);
		System.out.println(ll.size());//show the size of Linkedlist
		ll.remove(5);//remove the value of index
		Enumeration<String> i=ll.elements();
		while (i.hasMoreElements()) {
			System.out.print(i.nextElement()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether Linkedlist empty or not
		System.out.println(ll.contains("Banu"));//it checks whether the String is there in Linkedlist or not
		System.out.println(ll.indexOf("Abhinay"));//It shows the index of a String
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object
	}
}
