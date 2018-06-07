package com.bridgeit.aopaspect;

import org.aopalliance.intercept.Joinpoint;

public class AccountServiceAspect {

	public void beforeAdvice(Joinpoint joinpoint) {
		System.out.println("Happpyyyyyyy");
	}
}
