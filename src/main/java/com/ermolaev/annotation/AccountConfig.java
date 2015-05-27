package com.ermolaev.annotation;

import org.springframework.context.annotation.*;

@Configuration
public class AccountConfig {
	
	@Bean(name = "AccountMilion")
	public Account accountMilion()
	{
		return new Account(2500000.0f);
	}
	
	@Bean(name = "AccountThousand")
	public Account accountThousand()
	{
		return new Account(350000.0f);
	}
}
