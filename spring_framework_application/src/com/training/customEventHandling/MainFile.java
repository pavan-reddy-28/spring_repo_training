package com.training.customEventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("customEventBean.xml");
		CustomEventPublisher cvp = (CustomEventPublisher)context.getBean("customEventPublisher");
		cvp.publish();
		cvp.publish();
	}

}
