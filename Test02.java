package example;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[]args)
	{
		randomTest();
		System.out.println("��ϲ");
	}
	/*
	 * ����ʵ�ֲ�����С��Ϸ
	 */
	public static void randomTest() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		//random ����һ�������
		int randomTest = r.nextInt(100)+1;
		System.out.println(randomTest);
		System.out.print("�����룺");
		while(true)
		{
			//ʹ��scanner�û�����
			int scTest = sc.nextInt();
			if(scTest>randomTest)
			{
				System.out.println("�´���");
			}else if(scTest<randomTest)
			{
				System.out.println("��С��");
			}
			else {
				System.out.println("�¶���");
				//��������break�Ļ�ѭ�����治��������Ӷ�����������Ϊѭ��������
				break;
				//��Ҫ��break;
			}
			
		}
		System.out.println("��ϲ");
	}
}
