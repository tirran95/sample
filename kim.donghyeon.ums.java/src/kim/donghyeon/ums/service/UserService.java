package kim.donghyeon.ums.service;

import java.util.*;
import kim.donghyeon.ums.domain.User;

public interface UserService {
	public Map<Integer,User> getUsers();
	public void writeUser(User user);
	public void changeUserName(int userNum,String userName);
	public void deleteUser(int userNum);
	public boolean userNumCheek(int userNum);
}
