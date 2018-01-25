package kim.donghyeon.ums.service;

import java.util.List;

import kim.donghyeon.ums.dao.UserDao;
import kim.donghyeon.ums.dao.UserDaoImpl;
import kim.donghyeon.ums.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(){
		userDao=new UserDaoImpl();
	}

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getUsers(){
		return userDao.getUsers();
	}
	
	public User getUser(){
		return userDao.getUser();
	}
	
	public boolean joinUser(String userName){
		return userDao.joinUser(userName);
	}
	
	public boolean updateUser(User user){
		return userDao.updateUser(user);
	}
	
	public boolean delUser(int userNo){
		return userDao.delUser(userNo);
	}
}
