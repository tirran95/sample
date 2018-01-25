package kim.donghyeon.ums.domain;

import java.sql.Date;

public class User {
	private int userNum;
	private String userName;
	private Date regDate;
	
	public User(int userNum, String userName, Date regDate) {
		super();
		this.userNum = userNum;
		this.userName = userName;
		this.regDate = regDate;
	}
	public User(){}
	
	public int getUserNum() {
		return userNum;
	}
	public String getUserName() {
		return userName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String toString(){
		return String.format(" %d %6s %s", userNum,userName,regDate);
	}
}
