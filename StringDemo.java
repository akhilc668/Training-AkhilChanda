package com.string;

public class StringDemo {

	public static void main(String[] args) {
		String name="Akhil";
		System.out.println(name.charAt(1));//finds character at given index and returns it
		System.out.println(name.concat(" Chanda"));//combine and returns string but it doesn't store
		System.out.println(name.equals("Akhil"));//it give true only when the given string is similar to string
		System.out.println(name.equalsIgnoreCase("akhil"));//it give true whether the given string is similar to string in any uppercase or lowercase
		System.out.println(name.indexOf('h'));//finds the index of a given char and returns it
		name=name.concat(" Chanda");
		System.out.println(name.substring(2));//it return sub string from given index
		System.out.println(name.substring(1, 4));//it return sub string in given range
		String[] s1=name.split(" ");//it split into array using with given char
		System.out.println(s1[0]);
		char[] s=name.toCharArray();//it split to character array
		System.out.println(s[0]+" "+s[10]);
		System.out.println(name.toLowerCase());//it convert all characters to lower case
		System.out.println(name.toUpperCase());//it convert all characters to upper case
		System.out.println(name.endsWith("da"));//it checks whether the String ends with given string or character
		System.out.println(name.isEmpty());//it checks whether the string is empty or not
		System.out.println(name.isBlank());//it similar to isEmpty();
		System.out.println(name.lastIndexOf('a'));//it gives the last index of the given character.\
		name=" Akhil Chanda ";
		System.out.println(name.trim());//it removes the space ar starting and ending
	}

}
