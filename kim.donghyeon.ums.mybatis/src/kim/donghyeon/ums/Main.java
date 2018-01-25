package kim.donghyeon.ums;

import kim.donghyeon.ums.dao.UserDao;
import kim.donghyeon.ums.dao.UserDaoImpl;
import kim.donghyeon.ums.presentation.Console;
import kim.donghyeon.ums.presentation.Menu;
import kim.donghyeon.ums.presentation.UserIo;
import kim.donghyeon.ums.presentation.UserIoImpl;
import kim.donghyeon.ums.service.UserService;
import kim.donghyeon.ums.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao=new UserDaoImpl();
		UserService userService=new UserServiceImpl(userDao);
		UserIo userIo=new UserIoImpl(userService);
		Menu menu=new Menu(userIo);
		
		String[] menus={"목록","등록","수정","삭제"};
		Console.info("UMS를 시작합니다.");
		menu.play(menus);
		Console.info("UMS를 종료합니다.");
		
	}
}