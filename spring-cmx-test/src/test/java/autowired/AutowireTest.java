package autowired;

import autowire.Inner;
import autowire.Outer;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	@Test
	public void autowireTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
		Outer outer = (Outer) applicationContext.getBean("outer");
	}

	@Test
	public void noAutowireTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireByName.xml");
		Outer outer = (Outer) applicationContext.getBean("outer");
	}
}
