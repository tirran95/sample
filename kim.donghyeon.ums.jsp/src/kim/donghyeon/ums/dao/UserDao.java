package kim.donghyeon.ums.dao;

import java.util.List;

import kim.donghyeon.ums.domain.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUser(int userNum);
	public boolean addUser(String userName);
	public boolean updateUser(int userNum,String userName);
	public boolean deleteUser(int userNum);
}
