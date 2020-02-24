package com.example.facades;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // for spring
@Aspect // for Aspect programming - reflection will read the annotations below
public class EmployeeServiceAspect {

	// execution(returnType package.class.method
//	@Before("execution(* com.example.facades.EmployeeFacade.*(..) )")
//	public void runBeforeCreate(JoinPoint joinPoint) {
//		System.out.println("BEFORE: " + joinPoint);
//	}
//	
//	@After("execution(* com.example.facades.EmployeeFacade.*(..) )")
//	public void runAfter(JoinPoint joinPoint) {
//		System.out.println("AFTER: " + joinPoint);
//	}
	
	@Around("execution(* com.example.facades.EmployeeFacade.*(..) )")
	public Object wow(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("BEFORE! ");
		
		// run the original method!
		Object obj = pjp.proceed();
		if(obj instanceof String) {
			obj += "asdsdf";
		}
		
		System.out.println("AFTER! ");
		
		return obj;
	}
	
	
	
}
