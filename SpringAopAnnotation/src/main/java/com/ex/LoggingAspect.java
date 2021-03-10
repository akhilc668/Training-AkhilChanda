package com.ex;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect  {
	
	@AfterReturning("execution(public void widthdrawl())")
	public void afterReturning() {
		// TODO Auto-generated method stub
		System.out.println("Logging Aspect from ");
	}
	
	@After("execution(public void widthdrawl())")
	public void after() {
		System.out.println("looging aspect using after annontation");
	}

}
