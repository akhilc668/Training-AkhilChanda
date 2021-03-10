package com.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuthenticationAspect {
	
	@Before("execution(public void *())")
	public void before(JoinPoint jp)  {
		// TODO Auto-generated method stub
		System.out.println("AuthenticationAspect from "+jp.getSignature().getName());
		
	}

}
