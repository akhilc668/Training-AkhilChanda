package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Akhil");
		al.add("Mahesh");
		al.add("Banu");
		al.add("Abhinay");
		al.add("Nikhil");
		al.add("Bunny");
		System.out.println(al);
		System.out.println(al.get(3));//gets the value of index
		al.set(4, "Srinivas");//replace of the index
		System.out.println(al);
		System.out.println(al.size());//show the size of arraylist
		al.remove(5);//remove the value of index
		Iterator<String> i=al.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+al.isEmpty());//it checks whether arraylist empty or not
		System.out.println(al.contains("Banu"));//it checks whether the String is there in arraylist or not
		System.out.println(al.indexOf("Abhinay"));//It shows the index of a String
		al.clear();//it clears the data
		System.out.println("\n"+al.isEmpty());
		System.out.println(al.removeAll(al));//it clear object
	}

}
