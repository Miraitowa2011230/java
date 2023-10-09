package oop;

import java.util.ArrayList;

import domain.Student;

public class ArrayListTest2 {
	//创建一个存储学生对象的集合，使用程序实现在控制台遍历输出
	public static void main(String[]args) {
		Student stu1 = new Student("张三",23);
		Student stu2 = new Student("李四",14);
		Student stu3 = new Student("王五",15);
		
		ArrayList<Student> list = new ArrayList();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
		
		
	}

}
