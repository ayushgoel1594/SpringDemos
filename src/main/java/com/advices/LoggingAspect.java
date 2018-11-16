package com.advices;

import java.text.DateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@After("execution(* com.advices.ReportService.generateReport(..))")	
	public void logAfterAdvice(JoinPoint joinPoint){
		
	    //Log Joinpoint signature details
		
		System.out.println("In Advice, Joinpoint signature :" + joinPoint.getSignature());

		long time = System.currentTimeMillis();
		
        //Log details such as time stamp of report generated
        System.out.println("Report generated at time:" + DateFormat.getDateTimeInstance().format(time));
	}	
	
}