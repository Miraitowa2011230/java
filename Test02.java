package example;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[]args)
	{
		randomTest();
		System.out.println("恭喜");
	}
	/*
	 * 需求：实现猜数字小游戏
	 */
	public static void randomTest() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		//random 产生一个随机数
		int randomTest = r.nextInt(100)+1;
		System.out.println(randomTest);
		System.out.print("请输入：");
		while(true)
		{
			//使用scanner用户输入
			int scTest = sc.nextInt();
			if(scTest>randomTest)
			{
				System.out.println("猜大了");
			}else if(scTest<randomTest)
			{
				System.out.println("猜小了");
			}
			else {
				System.out.println("猜对了");
				//如果不添加break的话循环下面不允许在添加东西，程序认为循环无限制
				break;
				//重要的break;
			}
			
		}
		System.out.println("恭喜");
	}
}
