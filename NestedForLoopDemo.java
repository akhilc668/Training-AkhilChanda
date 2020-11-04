package com.loop;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		System.out.println("Forward Pattern");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Reverse pattern");
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
