package kim.donghyeon.ums.dao;

import kim.donghyeon.ums.domain.*;
import java.util.*;

public class UserDaoImpl implements UserDao{
	private Map<Integer,User> users;
	
	public UserDaoImpl(){
		users=new HashMap<>();
	}
	
	public Map<Integer,User> getUsers() {
		return users;
	}
	
	public void addUser(User user){
		users.put(user.getUserNum(),user);
	}
}