package oop;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[]args) {
		//���ַ�����ģʽ�Ӽ��̽���һ���ַ��������м����λ��������
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ֻ���");
		String tmp=sc.nextLine();
		String start=tmp.substring(0, 3);
		String end=tmp.substring(7);
		System.out.println(start+"****"+end);
		
		
	}

}
