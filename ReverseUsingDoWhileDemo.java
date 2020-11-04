package com.loop;

public class ReverseUsingDoWhileDemo {
	public static void main(String[] args) {
		int rem,sum=0,temp=123,num=123;
		do {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}while(num>0);
		System.out.println("Reverse of a "+temp+" is "+sum);
	}
}
