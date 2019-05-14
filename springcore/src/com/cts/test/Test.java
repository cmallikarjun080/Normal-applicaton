package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.Employee;

public class Test {

	public static void main(String[] args) {
         
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cts/resources/springconfig.xml");
		 Employee emp = context.getBean("employee", Employee.class);
		     System.out.println(emp);
	}

}
