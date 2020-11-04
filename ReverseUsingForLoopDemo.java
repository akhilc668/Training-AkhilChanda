package com.loop;

public class ReverseUsingForLoopDemo {

	public static void main(String[] args) {
		int rem,sum=0,temp=123,num=123;
		for( ;num>0;) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of a "+temp+" is "+sum);
	}

}
