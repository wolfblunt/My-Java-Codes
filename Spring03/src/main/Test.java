package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.Rectangle;
import demo.Triangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("tri");
		t.draw();
		Rectangle r = (Rectangle)context.getBean("rect");
		r.draw();
	}

}
