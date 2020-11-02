package com.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm = new TreeMap<>();
		hm.put(1,"Akhil");
		hm.put(2,"Mahesh");
		hm.put(3,"Banu");
		hm.put(4,"Abhinay");
		hm.put(5,"Akhil");
		hm.put(6,"Nikhil");
		hm.put(7,"Bunny");
		System.out.println(hm);
		System.out.println(hm.size());//show the size of HashMap
		System.out.println("\n"+hm.isEmpty());//it checks whether HashMap empty or not
		System.out.println(hm.containsKey(2));//it checks whether key present or not
		System.out.println(hm.containsValue("Akhil"));//it checks whether Value present or not
		hm.replace(4, "Abhinay", "Pandu");//Replace the value
		System.out.println(hm);
		System.out.println(hm.subMap(2,false, 4,true));//it shows the subMap of map
		System.out.println(hm.headMap(5,true));//it shows head of the map
		System.out.println(hm.tailMap(4,false));//it shows tail of the map
		hm.clear();//it clears the data
	}
}
