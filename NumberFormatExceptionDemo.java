package com.exception;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Number format Exception");
		try {
			String n=" 123";
			Integer.parseInt(n);
		}catch(NumberFormatException nf) {
			nf.printStackTrace();
		}
	}

}
