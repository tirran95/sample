package kim.donghyeon.ums.dao;

import java.util.*;
import kim.donghyeon.ums.domain.*;

public interface UserDao {
	public Map<Integer,User> getUsers();
	public void addUser(User user);
}
