package oop;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[]args) {
		//以字符串的模式从键盘接收一个字符串，将中间的四位号码屏蔽
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入手机号");
		String tmp=sc.nextLine();
		String start=tmp.substring(0, 3);
		String end=tmp.substring(7);
		System.out.println(start+"****"+end);
		
		
	}

}
