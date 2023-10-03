package example;

public class Test05 {
	public static void main(String[]args) {
		int[] arr= {100,50,20,90,90};
		System.out.println(getMax(arr));
		System.out.println(getMin(arr));
		System.out.println(getSum(arr));
		System.out.println(getAvg(arr));
		System.out.println(getCount(arr));

		
	}
	//求最大值
	public static int getMax(int[]arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}else {
				continue;
			}
		}
		return max;
	}
	//求最小值
	public static int getMin(int[]arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}else {
				continue;
			}
		}
		return min;
	}
	//求和
	public static int getSum(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	//求平均值
	public static double getAvg(int[]arr) {
		int sum=getSum(arr);
		double avg=(sum*1.0)/arr.length;
		//除以1.0的意义是整数除以整数等于整数，右边给左边赋值，例如double sum=5/2;答案等于2.0
		return avg;
	}
	//求低于平均值的人数
	public static int getCount(int[]arr) {
		int count=0;
		double avg=getAvg(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<avg) {
				count++;
			}
		}
		return count;
	}

}
