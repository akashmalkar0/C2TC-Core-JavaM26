package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test1 {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("Bean.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e = (Employee) factory.getBean("obj");
		e.setId(12);
		e.setName("Vikas");
		e.setCity("Pune");
		e.display();

	}
}
