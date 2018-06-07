package com.bridgeit.AOPAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Web.xml");
       Operation operation=(Operation) context.getBean("opration");
       System.out.println("First ");
       operation.k();
       System.out.println("second");
       operation.m();
       System.out.println("third");
       operation.msg();
       ((AbstractApplicationContext) context).close();
    }
}
