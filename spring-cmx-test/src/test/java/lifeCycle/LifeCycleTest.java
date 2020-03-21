package lifeCycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: chaitou
 */
public class LifeCycleTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycle.xml");
		LifeCycleBean myLifeCycleBean = applicationContext.getBean("lifeCycleBean", LifeCycleBean.class);
		System.out.println("12. bean创建完成 name： " + myLifeCycleBean.getName());
		((ClassPathXmlApplicationContext) applicationContext).destroy();
	}
}
