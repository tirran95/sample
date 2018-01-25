package kim.donghyeon.ums.dao.mapper;

import java.util.List;
import kim.donghyeon.ums.domain.User;

public interface UserMapper {
	public List<User> getUsers();
	public User getUser();
	public int joinUser(String userName);
	public int updateUser(User user);
	public int delUser(int userNo);
}