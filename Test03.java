package example;

import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
		//printArray01();
		//printArray02();
		printArray03();
	}
	//�򵥱�������
	public static void printArray01() {
		int [] arr= {11,22,33,44,55,66,77,33,44,55,66,99};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	//ʹ���û����̱�������
	public static void printArray02() {
		int [] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j =0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
	//�������е�żԪ������Ͳ���
	public static void printArray03() {
		int sum=0;
		int [] arr=new int[] {11,22,33,44,55};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}else {
				continue;
			}
		}
		System.out.println("ż���ĺ�Ϊ��"+sum);
	}

}
