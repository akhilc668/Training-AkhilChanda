package com.list;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Akhil");
		ll.add("Mahesh");
		ll.add("Banu");
		ll.add("Abhinay");
		ll.add("Nikhil");
		ll.add("Bunny");
		ll.addFirst("Sai");//it add the data at first
		ll.addLast("Krishna");//it add the data at last
		System.out.println(ll);
		System.out.println(ll.get(3));//gets the value of index
		System.out.println(ll.getFirst());//gets the first value of list
		System.out.println(ll.getLast());//gets the last value of list
		ll.removeFirst();//removes the first element in the list
		ll.removeLast();//removes the last element in the list
		ll.set(4, "Srinivas");//replace of the index
		System.out.println(ll);
		System.out.println(ll.size());//show the size of Linkedlist
		ll.remove(5);//remove the value of index
		System.out.println(ll.peek());//it return the first element from list
		System.out.println(ll.poll());//it return the first element from list and remove from it
		Iterator<String> i=ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether Linkedlist empty or not
		System.out.println(ll.contains("Banu"));//it checks whether the String is there in Linkedlist or not
		System.out.println(ll.indexOf("Abhinay"));//It shows the index of a String
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object
	}

}
