package com.ermolaev.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Address addr1 = (Address)ctx.getBean("address");
        addr1.setCity("Los Angeles");
        addr1.setCountry("USA");
        
        Address addr2 = (Address)ctx.getBean("address");
        addr2.setCity("Auckland");
        addr2.setCountry("New Zealand");
        
        Person woman1 = (Person)ctx.getBean("female");
        woman1.setFirstName("Jennifer");
        woman1.setLastName("Aniston");

        Person man1 = (Person)ctx.getBean("male");
        man1.setFirstName("Roger");
        man1.setLastName("Moore");
        
        Account acc1 = (Account)ctx.getBean("AccountMilion");
        acc1.setPerson(woman1);
        acc1.setAddress(addr1);
        
        Account acc2 = (Account)ctx.getBean("AccountThousand");
        acc2.setPerson(man1);
        acc2.setAddress(addr2);
        
        acc1.print();
        acc2.print();
        
        ctx.registerShutdownHook();
    }
}
