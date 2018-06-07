package com.bridgeit.methodeInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("webpg.xml");
		TicketVendingMachin ticketvending=context.getBean("ticketvending",TicketVendingMachin.class);
		System.out.println("hashcode of tickevending mCHIN "+ticketvending.hashCode());
		Ticket ticket=ticketvending.generateTicket();
		System.out.println("hashcode of ticket is "+ticket.hashCode());
		System.out.println(ticket.printTicket());
		Ticket ticket1=ticketvending.infoTickt();
		System.out.println(ticket.ticketNumber());
		System.out.println("hashcode of ticket1 is "+ticket1.hashCode());
		
		context.close();

	}

}
