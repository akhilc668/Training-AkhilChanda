package com.loop;

public class SumOfIndiviualUsingDoWhileDemo {
	public static void main(String[] args) {
		int rem,sum=0,temp=123,num=123;
		do{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}while(num>0);
		System.out.println("Sum of Indiviuals of a "+temp+" is "+sum);
	}
}
