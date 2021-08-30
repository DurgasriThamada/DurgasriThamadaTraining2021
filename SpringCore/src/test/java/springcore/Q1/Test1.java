package springcore.Q1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void test() {
		ApplicationContext con= new ClassPathXmlApplicationContext("beans1.xml");
		Customer cus= (Customer) con.getBean("customer");
		assertEquals(cus, new Customer(121, "Durga", 9553456789L, new Address("ECIL", "Hyderabad", "Telangana", 500062, "India")));
	}

}
