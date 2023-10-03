package example;

public class Test04 {
	public static void main(String[]args) {
		int [] arr01=new int[] {33,44,66,99,10};
		int [] arr02=new int[] {22,44,66,90,10};
		System.out.println(getMax(arr02));
	}
	//数组遍历-求最大值
	public static int getMax(int[]arr) {
		
		//定义max变量来记录数组中不断变化的数据
		int max=arr[0];
		//遍历数组，获取每一个元素
		for(int i=1;i<arr.length;i++) {
			//逐个比较
			if(arr[i]>max) {
				//记录更大的元素
				max=arr[i];
			}else {
				continue;
			}
		}
		return max;
	}

}
