package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.JdbcDaoImpl;
import model.Student;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = (JdbcDaoImpl)context.getBean("jdbcDaoImpl");
		System.out.println(dao.getStudentName(1));
	}

}
