package kim.donghyeon.ums.domain;

import java.time.LocalDate;

public class User {
	private String userName;
	private LocalDate regDate;
	private static int userCnt;	
	private int userNum;
	
	public User(String userName){
		userNum=++userCnt;
		this.userName=userName;
		regDate=LocalDate.now();
	}
	
	public int getUserNum() {
		return userNum;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString(){
		return String.format("%d %s %s"
				, this.userNum,this.userName,this.regDate);
	}
}