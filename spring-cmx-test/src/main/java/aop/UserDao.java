package aop;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public void findUser() {
		System.out.println("findUser");
	}
}
