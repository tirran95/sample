package kim.donghyeon.ums.io;

import java.util.Scanner;

public interface Console {
	Scanner sc=new Scanner(System.in);
	
	public static int inInt(String msg){
		System.out.print(msg+"\n▶ ");
		int i=sc.nextInt(); sc.nextLine();
		return i;
	}
	
	public static void info(Object obj){
		System.out.println(obj);
	}
	
	public static void errMsg(){
		System.err.println("ERROR: 존재하는 메뉴 번호를 입력하세요.");
	}
	public static void errMsg(String errMsg){
		System.err.println(errMsg);
	}
	
	public static String inStr(String msg){
		System.out.print(msg+"\n▶ ");
		return sc.nextLine();
	}
	
	public static void newLine(){
		sc.nextLine();
	}
}