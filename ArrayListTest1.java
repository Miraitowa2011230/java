package oop;

import java.util.ArrayList;

public class ArrayListTest1 {
	//创建一个存储字符串的集合，使用程序实现将4个字的人名，打印在控制台
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList();
		list.add("钢门吹雪");
		list.add("西域狂鸭");
		list.add("张三");
		list.add("甄妮麻袋亲");
		list.add("李四");
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
