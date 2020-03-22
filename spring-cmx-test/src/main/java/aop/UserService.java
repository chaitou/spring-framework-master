package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService{

	@Autowired
	UserDao userDao;

	@Override
	public void findUser() {
		userDao.findUser();
	}
}
