package com.loop;

public class WhileDemo {
	public static void main(String[] args) {
		int fact=1,num=5,temp=5;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial of "+temp+" is "+fact);
	}
}
