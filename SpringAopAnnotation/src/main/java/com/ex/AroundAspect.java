package com.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
	
	@Around("execution(public void *())")
	public void arounding(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("this is around before");
		pjp.proceed();
		System.out.println("this is around after");
	}
}
