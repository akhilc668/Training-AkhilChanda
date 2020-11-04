package com.loop;

public class ReverseUsingWhileDemo {

	public static void main(String[] args) {
		int rem,sum=0,temp=123,num=123;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of a "+temp+" is "+sum);
	}

}
