package oop;

import java.util.ArrayList;

public class ArrayListDemo1 {
	//����һ���洢�ַ����ļ��ϣ��ڲ��洢3���ַ���Ԫ�أ�������ӡ
	public static void main(String[]args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
		}
		

	}

}
