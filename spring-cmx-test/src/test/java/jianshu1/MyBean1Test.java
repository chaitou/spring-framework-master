package jianshu1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyBean1Test {
	@Test
	public void test1() {
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("jianshu1-config.xml"));
		MyBean1 myTestBean = (MyBean1) bf.getBean("myBean1");
		System.out.println(myTestBean.getTestStr());
	}
}
