package kim.donghyeon.ums.service;

import kim.donghyeon.ums.dao.*;
import kim.donghyeon.ums.domain.*;

import java.util.*;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao){
		this.userDao=userDao;
	}
	
	public Map<Integer,User> getUsers(){
		return userDao.getUsers();
	}
	
	public void writeUser(User user){
		userDao.addUser(user);
	}
	
	public boolean userNumCheek(int userNum){
		try{
			User user=userDao.getUsers().get(userNum);
			user.getUserNum();
		}catch(NullPointerException e){
			return false;
		}
		return true;
	}
	
	public void changeUserName(int userNum,String userName){
		userDao.getUsers().get(userNum).setUserName(userName);
	}
	
	public void deleteUser(int userNum){
		userDao.getUsers().remove(userNum);
	}
}