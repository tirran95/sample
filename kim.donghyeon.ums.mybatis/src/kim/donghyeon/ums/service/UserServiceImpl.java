package kim.donghyeon.ums.service;

import java.util.*;

import kim.donghyeon.ums.dao.UserDao;
import kim.donghyeon.ums.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao){
		this.userDao=userDao;
	}
	
	public List<User> getUserList(){
		return userDao.getUsers();
	}
	
	public User findUser(int userNum){
		return userDao.getUser(userNum);
	}
	
	public boolean joinUser(String userName){
		return userDao.addUser(userName);
	}
	
	public boolean corructUser(int userNum,String userName){
		return userDao.updateUser(userNum, userName);
	}
	
	public boolean secedeUser(int userNum){
		return userDao.deleteUser(userNum);
	}
}
