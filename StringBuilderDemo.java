package com.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Akhil");
		StringBuilder s=new StringBuilder("Akhil");
		System.out.println(sb);
		System.out.println(sb.charAt(1));//finds character at given index and returns it
		System.out.println(sb.append(" Chanda"));//combine and returns string 
		System.out.println(sb.equals(s));//it give true only when the given object address is equal to string object
		System.out.println(sb.indexOf("h"));//finds the index of a given char and returns it
		System.out.println(sb.substring(2));//it return sub string from given index
		System.out.println(sb.substring(1, 4));//it return sub string in given range
		System.out.println(sb.reverse());//it reverse the string
		System.out.println(sb.deleteCharAt(6));//it deletes the character at given index.
		sb.setCharAt(6, ' ');//replace the character at given index
		System.out.println(sb);
		System.out.println(sb.replace(6, 10, " lihk"));//it replace the characters in given range
	}

}
