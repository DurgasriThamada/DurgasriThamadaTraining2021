package springcore.Q2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.Q1.Customer;

public class Test1 {

	@Test
	public void test() {
		ApplicationContext con= new ClassPathXmlApplicationContext("beans2.xml");
		Question q= (Question) con.getBean("question");
		Question ques= new Question(121, "What are your names?", Arrays.asList("Tony", "Steve", "Thor"));
		assertEquals(q,ques);
	}

}
