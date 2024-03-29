package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("Bean.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee s = (Employee) factory.getBean("obj");
		s.setName("Akash");
		s.setId(12);
		s.setCity("Nagpur");
		s.display();

	}
}