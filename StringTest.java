package oop;

import java.util.Scanner;

public class StringTest {
	//键盘录入字符串，统计字符串中大，小写的字符，数字字符出现的次数
	//不考虑其他
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入:");
		String content= sc.nextLine();
		
		int smallCount=0;
		int bigCount=0;
		int numCount=0;
		
		char[]chars=content.toCharArray();
		for(int i=0;i<chars.length;i++) {
			//char c=chars[i];
			if(chars[i]>='a'&&chars[i]<='z') {
				smallCount++;
			}else if(chars[i]>='A'&&chars[i]<='Z') {
				bigCount++;
			}else if(chars[i]>='0'&&chars[i]<='9') {
				numCount++;
			}
		}
		System.out.println("小写字母:"+smallCount+"个");
		System.out.println("大写字母:"+bigCount+"个");
		System.out.println("数字字符:"+numCount+"个");

	}

}
