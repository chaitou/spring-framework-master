package aop;


import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopTest {
	@Test
	public void test1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		UserService userService = (UserService) applicationContext.getBean("userService", UserService.class);
		userService.findUser();
	}
}
