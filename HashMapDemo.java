package com.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
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
		hm.clear();//it clears the data
	}

}
