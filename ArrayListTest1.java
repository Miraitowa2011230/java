package oop;

import java.util.ArrayList;

public class ArrayListTest1 {
	//����һ���洢�ַ����ļ��ϣ�ʹ�ó���ʵ�ֽ�4���ֵ���������ӡ�ڿ���̨
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList();
		list.add("���Ŵ�ѩ");
		list.add("�����Ѽ");
		list.add("����");
		list.add("���������");
		list.add("����");
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			if(s.length()==4) {
				System.out.println(s);
			}else {
				continue;
			}
		}

	}

}
