package com.ermolaev.annotation;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
	
	@Before("execution(* com.ermolaev.annotation.Address.setCountry(..))")
	public void advice()
	{
		System.out.println("Before setCountry");
	}
}
