package oop;

import java.util.Scanner;

public class StringDemo1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//ģ���û���½��һ�����λ��ᣬ��½֮��Ҫ������Ӧ����ʾ
		
		String username="admin";
		String password = "123456";
		
		for(int i=0;i<=3;i++) {
			System.out.println("�������û���:");
			String inputUsername=sc.nextLine();
			
			System.out.println("����������:");
			String inputPassword=sc.nextLine();
			
			if(inputUsername.equals(username)&&inputPassword.equals(password)) {
				System.out.println("��½�ɹ�");
			}else {
				if(i==3) {
					System.out.println("���մ��������꣬���Ժ�����");
				}else {
					System.out.println("��½ʧ��,����ʣ��"+(3-i)+"�λ���");
				}
				
			}
		}
	}

}
