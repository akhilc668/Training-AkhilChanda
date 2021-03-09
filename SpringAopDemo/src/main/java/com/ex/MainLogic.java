package com.ex;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		Object o = context.getBean("getProxy");
		HdfcBank h=(HdfcBank)o;
		h.widthdrawl();
		h.deposit();
		
	}

}
