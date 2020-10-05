package com.stradtkt.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		//create application context
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		//create bean
		Organization org = (Organization) ctx.getBean("myorg");
		//invoke the bean method
		org.corporateSlogan();
		//close context container
		((FileSystemXmlApplicationContext) ctx).close();
	}

}
