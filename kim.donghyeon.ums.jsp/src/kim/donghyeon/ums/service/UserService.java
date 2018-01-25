package kim.donghyeon.ums.service;

import java.util.List;

import kim.donghyeon.ums.domain.User;

public interface UserService {
	public List<User> getUserList();
	public User findUser(int userNum);
	public boolean joinUser(String userName);
	public boolean corructUser(int userNum,String userName);
	public boolean secedeUser(int userNum);
}
