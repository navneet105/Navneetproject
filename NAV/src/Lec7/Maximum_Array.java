package Lec7;

public class Maximum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,8,9,2,4,7,};
		System.out.println(Max_Value1(arr));

	}
	public static int Max_Value(int[] arr) {
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
	
	public static int Max_Value1(int[]arr) {
		int max=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
