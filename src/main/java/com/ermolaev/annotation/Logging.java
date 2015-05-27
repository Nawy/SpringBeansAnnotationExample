package com.ermolaev.annotation;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
	
	int spaceCount = 0;
	
	@Before("execution(* com.ermolaev.annotation.Address.set*(..))")
	public void beforeAddressSet()
	{
		System.out.print("Before address set method invoked!");
	}
	
	@Pointcut("execution(* com.ermolaev.annotation.*.print(..))")
	public void printAll() {}
	
	@Before("printAll()")
	public void beforeAnyPrint()
	{
		System.out.print("print {\n");
		
		spaceCount += 1;
		this.printSpaces(spaceCount);
	}
	
	@After("printAll()")
	public void afterAnyPrint()
	{
		spaceCount -= 1;
		this.printSpaces(spaceCount);
		
		System.out.print("}\n");
		
		this.printSpaces(spaceCount);
	}
	
	private void printSpaces(int count)
	{
		for(int i = 0; i < spaceCount; i++)
			System.out.print("\t");
	}
}
