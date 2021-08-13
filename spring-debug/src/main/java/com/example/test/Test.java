package com.example.test;

import com.example.entity.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource;
		BeanFactory bf  = new XmlBeanFactory(new ClassPathResource(""));
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application.xml");
		Person p = ac.getBean("person", Person.class);
		System.out.println(p.getName());
	}
}
