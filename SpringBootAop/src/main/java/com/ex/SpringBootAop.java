package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootAop {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringBootAop.class, args);
		Object o = context.getBean("account");
		HdfcBank ub = (HdfcBank) o;
		ub.deposit();
		ub.withdraw();
	}
}
