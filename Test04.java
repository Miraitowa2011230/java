package example;

public class Test04 {
	public static void main(String[]args) {
		int [] arr01=new int[] {33,44,66,99,10};
		int [] arr02=new int[] {22,44,66,90,10};
		System.out.println(getMax(arr02));
	}
	//�������-�����ֵ
	public static int getMax(int[]arr) {
		
		//����max��������¼�����в��ϱ仯������
		int max=arr[0];
		//�������飬��ȡÿһ��Ԫ��
		for(int i=1;i<arr.length;i++) {
			//����Ƚ�
			if(arr[i]>max) {
				//��¼�����Ԫ��
				max=arr[i];
			}else {
				continue;
			}
		}
		return max;
	}

}
