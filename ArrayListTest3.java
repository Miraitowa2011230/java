package oop;

import java.util.ArrayList;
import java.util.Scanner;

import domain.Student;

public class ArrayListTest3 {
	//����һ���洢ѧ������ļ��ϣ�ʹ�ó���ʵ���ڿ���̨�������
	//ѧ�������������ɼ�������
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList();
		System.out.println("�������һλѧ�������������䣺");
		Student stu1 = new Student(null, 0);
		stu1.setName(sc.next());
		stu1.setAge(sc.nextInt());
		System.out.println("������ڶ�λѧ�������������䣺");
		Student stu2 = new Student(null, 0);
		stu2.setName(sc.next());
		stu2.setAge(sc.nextInt());
		System.out.println("���������λѧ�������������䣺");
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
