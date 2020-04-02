package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void findUser() {
		userDao.findUser();
	}
}
