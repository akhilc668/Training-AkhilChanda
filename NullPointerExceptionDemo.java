package com.exception;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Null Pointer Exception:");
		String s=null;
		try {
			s.length();
		}catch(NullPointerException np) {
			np.printStackTrace();
		}finally {
			System.out.println("Null pointer exception");
		}
	}
}
