package oop;

import java.util.Scanner;

public class StringTest {
	//����¼���ַ�����ͳ���ַ����д�Сд���ַ��������ַ����ֵĴ���
	//����������
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������:");
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
		System.out.println("Сд��ĸ:"+smallCount+"��");
		System.out.println("��д��ĸ:"+bigCount+"��");
		System.out.println("�����ַ�:"+numCount+"��");

	}

}
