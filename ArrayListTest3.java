package oop;

import java.util.ArrayList;
import java.util.Scanner;

import domain.Student;

public class ArrayListTest3 {
	//创建一个存储学生对象的集合，使用程序实现在控制台遍历输出
	//学生姓名，年龄由键盘输入
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList();
		System.out.println("请输入第一位学生的姓名和年龄：");
		Student stu1 = new Student(null, 0);
		stu1.setName(sc.next());
		stu1.setAge(sc.nextInt());
		System.out.println("请输入第二位学生的姓名和年龄：");
		Student stu2 = new Student(null, 0);
		stu2.setName(sc.next());
		stu2.setAge(sc.nextInt());
		System.out.println("请输入第三位学生的姓名和年龄：");
		Student stu3 = new Student(null, 0);
		stu3.setName(sc.next());
		stu3.setAge(sc.nextInt());
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		for(int i=0;i<list.size();i++) {
			Student stu = list.get(i);
			System.out.println(stu.getName()+stu.getAge());
		}
	}

}
