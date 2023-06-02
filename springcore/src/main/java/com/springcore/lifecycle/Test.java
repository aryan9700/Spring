package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Kachori k1=(Kachori) context.getBean("k1");
		System.out.println(k1);
		

	}
}