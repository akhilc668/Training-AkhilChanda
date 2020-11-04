package com.loop;

public class ForLoopDemo {

	public static void main(String[] args) {
		int fact=1,num=5,temp=5;
		for(;num>0;num--) {
			fact=fact*num;
		}
		System.out.println("Factorial of "+temp+" is "+fact);
	}

}
