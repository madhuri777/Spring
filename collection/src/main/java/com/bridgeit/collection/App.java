package com.bridgeit.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
       SpringCollection collection=(SpringCollection) context.getBean("collection");
       collection.getList();
       collection.getSet();
       collection.getMap();
       context.close();
    }
}
