package com.cts.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.bean1.Room;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/resources/springconfig.xml");
		
		    Room r = ctx.getBean("room",Room.class);
		       
		        System.out.println(r);
	}

}
