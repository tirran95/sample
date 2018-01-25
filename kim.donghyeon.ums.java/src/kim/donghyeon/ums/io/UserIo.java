package kim.donghyeon.ums.io;

import kim.donghyeon.ums.domain.*;
import kim.donghyeon.ums.service.*;
import java.util.*;

public class UserIo {
	public UserService userService;
	
	public UserIo(UserService userService){
		this.userService=userService;
	}

	public void play(){
		boolean isOne=true;
		int choice=0;
		Console.info("UMS를 시작합니다.");
		do{
			try{
				choice=Console.inInt("1.목록 2.등록 3.수정 4.탈퇴 0.종료");
			}catch(InputMismatchException e){
				choice=-1;
				Console.newLine();
			}
			
			switch(choice){
				case CODE.SHOW:	showUsers(); break;
				case CODE.ADD:	regUser(); break;
				case CODE.CHANGE: changeUserName(); break;
				case CODE.DELET: deleteUser(); break;
				case CODE.CLOSE: isOne=false; break;
				default: Console.errMsg();
			}
		}while(isOne);
		Console.info("UMS를 종료합니다.");
	}
	
	public void showUsers(){
		Map<Integer,User> src=userService.getUsers();
		Set<Integer> keys=src.keySet();
		for(int num:keys)
			Console.info(src.get(num));
		if(src.size()==0) 
			Console.info("등록된 사용자가 없습니다.");
	}
	
	public void regUser(){
		String userName=Console.inStr("등록할 사용자 이름을 입력하세요.(0입력시 돌아감)");
		if(userName.charAt(0)==CODE.CANCEL){
			Console.info("사용자 정보 수정 취소.");
			return;
		}
		User user=new User(userName);
		userService.writeUser(user);
		Console.info("사용자 등록 성공");
	}
	
	public void changeUserName(){
		if(userService.getUsers().size()==0){
			Console.info("사용자가 없습니다"); return;
		}
		int userNum=Console.inInt("수정할 사용자 번호를 입력하세요.(0입력시 돌아감)");
		if(userNum==CODE.CLOSE){
			Console.info("사용자 정보 수정 취소.");
			return;
		}else if(false==userService.userNumCheek(userNum)){
			Console.errMsg("사용자가 없습니다.");
		}else{
		String userName=Console.inStr("수정할 이름을 입력하세요.");
		userService.changeUserName(userNum, userName);
		Console.info("사용자 정보 수정 성공");
		}
	}

	public void deleteUser(){
		if(userService.getUsers().size()==0){
			Console.info("사용자가 없습니다"); return;
		}
		int userNum=Console.inInt("탈퇴할 사용자 번호를 입력하세요.(0입력시 돌아감)");
		if(userNum==CODE.CLOSE){
			Console.info("사용자 탈퇴 취소.");
			return;
		}else if(false==userService.userNumCheek(userNum)){
			Console.errMsg("사용자가 없습니다.");
		}else{
			userService.deleteUser(userNum);
			Console.info("사용자 탈퇴 성공.");
		}
	}
}