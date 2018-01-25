package kim.donghyeon.ums.service;

import java.util.List;

import kim.donghyeon.ums.domain.User;

public interface UserService {
	public List<User> getUsers();
	public User getUser();
	public boolean updateUser(User user);
	public boolean joinUser(String userName);
	public boolean delUser(int userNo);
}
