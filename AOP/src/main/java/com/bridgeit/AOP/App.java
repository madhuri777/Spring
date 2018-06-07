package com.bridgeit.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.model.Account;
import com.bridgeit.serviceimpl.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
    	System.out.println("jhdfsafd");
      AccountServiceImpl imple=(AccountServiceImpl) context.getBean("accountService");
      imple.updateAccountBalance(new Account("4849203121","madhuri Satkar"),10000L);
      System.out.println("kiijjbnjhgbd");
     context.close();
    }
}
