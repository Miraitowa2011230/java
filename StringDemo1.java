package oop;

import java.util.Scanner;

public class StringDemo1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//模拟用户登陆，一共三次机会，登陆之后要给出相应的提示
		
		String username="admin";
		String password = "123456";
		
		for(int i=0;i<=3;i++) {
			System.out.println("请输入用户名:");
			String inputUsername=sc.nextLine();
			
			System.out.println("请输入密码:");
			String inputPassword=sc.nextLine();
			
			if(inputUsername.equals(username)&&inputPassword.equals(password)) {
				System.out.println("登陆成功");
			}else {
				if(i==3) {
					System.out.println("今日次数已用完，请稍后再试");
				}else {
					System.out.println("登陆失败,您还剩余"+(3-i)+"次机会");
				}
				
			}
		}
	}

}
