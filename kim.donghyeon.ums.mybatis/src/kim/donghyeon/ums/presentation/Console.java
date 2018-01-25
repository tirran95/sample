package kim.donghyeon.ums.presentation;

import java.util.*;

public interface Console {
	Scanner sc=new Scanner(System.in);
	
	public static void info(Object obj){
		System.out.println(obj);
	}
	
	public static int inInt(String msg){
		int i=-1;
		System.out.print(msg+"\n▶ ");
		try{
			i=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e){}
		return i;
	}
	
	public static String inStr(String msg){
		System.out.print(msg+"\n▶ ");
		return sc.nextLine();
	}
	
	public static void err(String msg){
		System.out.println("ERROR: "+msg);
	}
}
