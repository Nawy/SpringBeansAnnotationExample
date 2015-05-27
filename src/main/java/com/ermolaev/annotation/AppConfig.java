package com.ermolaev.annotation;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@Import(AccountConfig.class)
public class AppConfig {
	
	@Bean(name = "male", initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public Person male()
	{
		return new Person(Person.Sex.MALE);
	}
	
	@Bean(name = "female", initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public Person female()
	{
		return new Person(Person.Sex.FEMALE);
	}
	
	@Bean(name = "address")
	public Address address()
	{
		return new Address();
	}
	
	@Bean
	public Logging logging()
	{
		return new Logging();
	}
}
