package proxyFactory;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfterAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("after log...");
	}
}
