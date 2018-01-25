package kim.donghyeon.ums;

import kim.donghyeon.ums.dao.*;
import kim.donghyeon.ums.service.*;
import kim.donghyeon.ums.io.*;

public class Main {
	public static void main(String[] args){
		UserDao userDao=new UserDaoImpl();
		UserService userService=new UserServiceImpl(userDao);
		UserIo userIo=new UserIo(userService);

		userIo.play();
		Console.info("--");
	}
}