package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.bean.Company;

public class Test {

	public static void main(String[] args) {
       
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/resoureces/springconfig.xml");
		 
		    Company cp = ctx.getBean("company", Company.class);
		        System.out.println(cp);
		           cp.getCompName();
		           cp.getEmployee();
		           cp.getLocation();
		           
	}

}
