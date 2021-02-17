package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		Insert i = (Insert) context.getBean("hTemplatei");
		i.insertValues();

		InnerJoin ij = (InnerJoin) context.getBean("hTemplates");
		ij.showInnerJoin();
		
		
		System.out.println("Left Join");
		LeftJoin lj = (LeftJoin) context.getBean("hTemplatel");
		lj.getLeftJoin();
		
		System.out.println("Right Join");
		RightJoin rj = (RightJoin) context.getBean("hTemplater");
		rj.getRightJoin();
	}

}
