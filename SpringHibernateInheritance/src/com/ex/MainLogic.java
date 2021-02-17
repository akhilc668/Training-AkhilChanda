package com.ex;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		/*
		 * OperationDisplay c = (OperationDisplay) context.getBean("hTemplates");
		 * c.display();
		 */
		JoinSubclass u=(JoinSubclass) context.getBean("hTemplatej");
		u.display();
	}

}
