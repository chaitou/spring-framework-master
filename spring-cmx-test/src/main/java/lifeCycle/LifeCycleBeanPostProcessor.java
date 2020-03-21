package lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class LifeCycleBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("lifeCycleBean")) {
			System.out.println("1. postProcessBeforeInstantiation被调用");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (beanName.equals("lifeCycleBean")) {
			System.out.println("3. postProcessAfterInstantiation被调用");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if (beanName.equals("lifeCycleBean")) {
			System.out.println("4. postProcessProperties被调用");
		}
		return null;
	}

//	@Override
//	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		return pvs;
//	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("lifeCycleBean")) {
			((LifeCycleBean) bean).setName("中中");
			System.out.println("8. postProcessBeforeInitialization被调用，把name改成中中");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("lifeCycleBean")) {
			((LifeCycleBean) bean).setName("大大");
			System.out.println("11. postProcessAfterInitialization被调用，把name改成大大");
		}
		return bean;
	}
}
