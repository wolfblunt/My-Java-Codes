package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import demo.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t =(Triangle) factory.getBean("triangle");
		t.draw();
		

	}

}
