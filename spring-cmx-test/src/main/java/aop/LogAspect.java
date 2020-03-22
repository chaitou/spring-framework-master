package aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution(* aop.UserService.findUser())")
	public void point() {
	}

	@Before("point()")
	public void before(){
		System.out.println("log before...");
	}

	@After("point()")
	public void after(){
		System.out.println("log after...");
	}
}
