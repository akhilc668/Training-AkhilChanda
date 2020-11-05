package com.exception;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Array IndexOutOf Bounds Exception:");
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		try {
			System.out.println(arr[11]);
		}catch(ArrayIndexOutOfBoundsException ai){
			ai.printStackTrace();
		}
		finally {
			System.out.println("Array IndexOutOfBounds Exception:");
		}
	}

}
