package kim.donghyeon.ums.dao;

import java.util.List;

import kim.donghyeon.ums.config.Configuration;
import kim.donghyeon.ums.dao.mapper.UserMapper;
import kim.donghyeon.ums.domain.User;

public class UserDaoImpl implements UserDao{
	private UserMapper mapper;
	
	public UserDaoImpl(){
		mapper=Configuration.getMapper(UserMapper.class);
	}

	public List<User> getUsers() {
		return mapper.getUsers();
	}
	
	public User getUser(int userNum){
		User user=null;
		user=mapper.getUser(userNum);
		return user;
	}
	
	public boolean addUser(String userName){
		mapper.addUser(userName);
		return true;
	}
	
	public boolean updateUser(int userNum,String userName){
		for(User tmp:mapper.getUsers()){
			if(tmp.getUserNum()==userNum){
					User user=new User();
					user.setUserNum(userNum);
					user.setUserName(userName);
					mapper.updateUser(user);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteUser(int userNum){
		if(mapper.delUser(userNum)>=1) return true;
		else return false;
	}
}
