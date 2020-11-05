package com.exception;

class Driving extends Exception {
	Driving(String s) {
		super(s);
	}
}

public class UserDefinedExceptionDemo {

	public static void main(String[] args) throws Driving {
		int[] a = { 18, 17, 19, 15, 21, 20 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 18) {
				System.out.println("Driving Licence is approved");
			} else {
				System.out.println("In else part");
				throw new Driving("Driving Licence is not approved");
			}
		}
	}

}
