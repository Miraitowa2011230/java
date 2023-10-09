package oop;

import java.util.ArrayList;

public class ArrayListDemo1 {
	//创建一个存储字符串的集合，内部存储3个字符串元素，遍历打印
	public static void main(String[]args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
		}
		

	}

}
