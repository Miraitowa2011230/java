package oop;

import java.util.ArrayList;

import domain.Student;

public class ArrayListTest2 {
	//����һ���洢ѧ������ļ��ϣ�ʹ�ó���ʵ���ڿ���̨�������
	public static void main(String[]args) {
		Student stu1 = new Student("����",23);
		Student stu2 = new Student("����",14);
		Student stu3 = new Student("����",15);
		
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
