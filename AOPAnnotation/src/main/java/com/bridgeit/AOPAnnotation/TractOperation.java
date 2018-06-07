package com.bridgeit.AOPAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TractOperation {

	@Pointcut("execution(* Operation.*())")
	public void msg() {}
	
	@Before("msg()")
	public void msgPrint() {
		System.out.println("This is the Advice Methode ");
	}
	
	@After("msg()")
	public void add() {
		System.out.println("addition 0");
	}
}
