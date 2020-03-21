package lifeCycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBean implements
		BeanNameAware,
		BeanFactoryAware,
		ApplicationContextAware,
		InitializingBean,
		DisposableBean {

	private BeanFactory beanFactory;

	private ApplicationContext applicationContext;

	private String name;

	public LifeCycleBean(String name) {
		System.out.println("2. 构造方法被调用，name：" + name);
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("5. BeanNameAware被调用, 获取到的beanName：" + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("6. BeanFactoryAware被调用，获取到beanFactory：" + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("7. ApplicationContextAware被调用，获取到ApplicationContextAware：" + applicationContext);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("9. afterPropertiesSet被调用");
	}

	public void myInit() {
		System.out.println("10. myInit自定义初始化方法被调用，name：" + getName());
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("13. DisposableBean被调用");
	}

	public void myDestroy() {
		System.out.println("14. destroy-method自定义销毁方法被调用");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}

