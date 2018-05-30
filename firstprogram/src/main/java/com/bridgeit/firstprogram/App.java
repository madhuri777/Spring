package com.bridgeit.firstprogram;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	HelloWord wd=(HelloWord) context.getBean("helloWorld");
    	wd.getMessage();
    	
    	//ClassPathXmlApplicationContext cntxt=(ClassPathXmlApplicationContext) context;
    	context.close();
    }
}
