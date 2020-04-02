package proxyFactory;

import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

public class UserServiceImplImplTest {

    @Test
    public void findUser() {

		// 1. 创建代理工厂
		ProxyFactory factory = new ProxyFactory();
		// 2. 设置代理目标对象
		factory.setTarget(new UserServiceImpl());
		// 3. 设置接口
		factory.setInterfaces(new Class[]{UserService.class});
		// 4. 设置增强
		factory.addAdvice(new LogBeforeAdvice());
		factory.addAdvice(new LogAfterAdvice());
		// 5. 获取代理对象
		UserService userService = (UserService) factory.getProxy();

		userService.findUser();

    }
}