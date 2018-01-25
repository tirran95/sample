package kim.donghyeon.ums.dao;

import java.util.List;

import kim.donghyeon.ums.config.Configuration;
import kim.donghyeon.ums.dao.mapper.UserMapper;
import kim.donghyeon.ums.domain.User;

public class UserDaoImpl implements UserDao{
	private UserMapper userMapper;
	
	public UserDaoImpl(){
		userMapper=Configuration.getMapper(UserMapper.class);
	}
	
	@Override
	public List<User> getUsers(){
		return userMapper.getUsers();
	}
	
	@Override
	public User getUser(){
		return userMapper.getUser();
	}
	
	@Override
	public boolean joinUser(String userName){
		if(userMapper.joinUser(userName)>0)
			return true;
		return false;
	}
	
	@Override
	public boolean updateUser(User user){
		if(userMapper.updateUser(user)>0)
			return true;
		return false;
	}
	
	@Override
	public boolean delUser(int userNo){
		if(userMapper.delUser(userNo)>0)
			return true;
		return false;
	}
}
