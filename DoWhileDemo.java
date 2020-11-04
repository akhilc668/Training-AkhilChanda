package com.loop;

public class DoWhileDemo {

	public static void main(String[] args) {
		int fact=1,num=5,temp=5;
		 do{
			fact=fact*num;
			num--;
		}while(num>0);
		System.out.println("Factorial of "+temp+" is "+fact);
	}

}
