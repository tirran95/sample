package kim.donghyeon.ums.presentation;

import kim.donghyeon.ums.domain.CODE;

public class Menu {
	private UserIo userIo;
	
	public Menu(UserIo userIo){
		this.userIo=userIo;
	}
	
	public void play(String[] menus){
		String menuMsg="";
		int index=1;
		for(String tmp:menus)
			menuMsg+=(index++)+"."+tmp+" ";
		menuMsg+="0.종료";
		
		boolean isFlag=true;
		while(isFlag){
			int choice=Console.inInt(menuMsg);
			switch(choice){
			case CODE.READ	:userIo.showList(); break;
			case CODE.CREATE:userIo.joinUser(); break;
			case CODE.UPDATE:userIo.corructUser(); break;
			case CODE.DELETE:userIo.secedeUser(); break;
			case CODE.CLOSE: isFlag=false; break;
			default: Console.err("존재하는 메뉴 번호를 입력하세요.");
			}
		}
	}
}
