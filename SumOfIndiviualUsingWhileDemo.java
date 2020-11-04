package com.loop;

public class SumOfIndiviualUsingWhileDemo {

	public static void main(String[] args) {
		int rem,sum=0,temp=123,num=123;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Indiviuals of a "+temp+" is "+sum);

	}

}
