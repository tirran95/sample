package kim.donghyeon.ums.dao;

import java.util.List;

import kim.donghyeon.ums.domain.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUser();
	public boolean joinUser(String userName);
	public boolean updateUser(User user);
	public boolean delUser(int userNo);
}
