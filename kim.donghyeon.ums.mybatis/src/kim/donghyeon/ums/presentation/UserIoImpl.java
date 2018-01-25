package kim.donghyeon.ums.presentation;

import java.util.*;

import kim.donghyeon.ums.domain.CODE;
import kim.donghyeon.ums.domain.User;
import kim.donghyeon.ums.service.UserService;

public class UserIoImpl implements UserIo{
	private UserService userService;
	
	public UserIoImpl(UserService userService){
		this.userService=userService;
	}
	
	public void showList(){
		if(userEmptyCheck()) return;
		List<User> users=userService.getUserList();
		for(User user:users){
			Console.info(user);
		}
	}
	
	public void joinUser(){
		String userName=Console.inStr("사용자 이름을 입력하세요.");
		if(userName.equals("0")){
			Console.info("사용자 등록 취소.");
			return;
		}
		if(userService.joinUser(userName)){
			Console.info("사용자 등록 성공.");
		}else{
			Console.info("사용자 등록 실패");
		}
	}
	
	public void corructUser(){
		if(userEmptyCheck()) return;
		
		int userNum=Console.inInt("수정할 사용자 번호를 입력하세요.");
		if(userNum==CODE.CLOSE){
			Console.info("사용자 수정 취소.");
			return;
		}
		if(userService.findUser(userNum)==null){
			Console.err("입력한 번호의 사용자가 없습니다.");
			return;
		}
		
		String userName=Console.inStr("사용자 이름을 입력하세요.");
		if(userService.corructUser(userNum, userName)){
			Console.info("사용자 수정 성공.");
		}else{
			Console.info("사용자 수정 실패.");
		}
	}
	
	public void secedeUser(){
		if(userEmptyCheck()) return;
		
		int userNum=Console.inInt("탈퇴할 사용자 번호를 입력하세요.");
		if(userNum==CODE.CLOSE){
			Console.info("사용자 탈퇴 취소.");
			return;
		}
		if(userService.findUser(userNum)==null){
			Console.err("입력한 번호의 사용자가 없습니다.");
			return;
		}
		
		if(userService.secedeUser(userNum)){
			Console.info("사용자 탈퇴 성공.");
		}else{
			Console.info("사용자 탈퇴 실패.");
		}
	}
	
	public boolean userEmptyCheck(){
		List<User> src=userService.getUserList();
		if(src.size()==0){
			Console.info("사용자가 없습니다.");
			return true;
		}else
			return false;
	}
}
