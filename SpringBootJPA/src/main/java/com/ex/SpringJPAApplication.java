package com.ex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJPAApplication {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cac= SpringApplication.run(SpringJPAApplication.class, args);
		MainLogic ml=cac.getBean(MainLogic.class);
		ml.logic();
	}
}
