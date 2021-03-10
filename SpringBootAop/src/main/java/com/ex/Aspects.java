package com.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {
	
	@Pointcut("execution(* withdraw()) || execution(* deposit())")
	public void myPointCut() {}

	@After("myPointCut()")
	public void logging(JoinPoint joinPoint) {
		System.out.println("Logging aspect: " +joinPoint.getSignature().getName());
	}
	
	@Before("myPointCut()")
	public void authenticate(JoinPoint joinPoint) {
		System.out.println("authentication completed: " +joinPoint.getSignature().getName());
	}

	@AfterReturning("execution(* accountholderName())")
	public void getName(JoinPoint joinPoint) {
		System.out.println("this is after returning "+joinPoint.getSignature().getName());
	}
	
	@AfterThrowing(pointcut = "execution(* printThrowException())", throwing = "ex")
	public void afterThrowing(IllegalArgumentException ex) {
		System.out.println("there is an exception: " +ex.toString());
		System.out.println("completed");
	}
	
	
	@Around("myPointCut()") 
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
	
		System.out.println(" this is before around  "+joinpoint.getSignature().getName());
		
		joinpoint.proceed();
		
		System.out.println(" this is after around  " +joinpoint.getSignature().getName());
	}
	 
}
