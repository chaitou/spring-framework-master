package aop;


import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect1 implements Ordered {

	@Pointcut("execution(* aop.UserServiceImpl.findUser())")
	public void point() {
	}

	@Before("point()")
	public void before(){
		System.out.println("log before1...");
	}
	
	@AfterReturning("point()")
	public void afterReturning() { System.out.println("log after returning1..."); }

	@Override
	public int getOrder() {
		return 1;
	}
}
