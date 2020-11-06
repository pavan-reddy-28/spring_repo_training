package com.training.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("taskContext.xml");
	User user = (User)context.getBean("userBean");
	Customer customer = (Customer)context.getBean("customerBean");
	Vendor vendor = (Vendor)context.getBean("vendorBean");
	System.out.println(user);
	System.out.println(customer);
	System.out.println(vendor);
	
}
}
