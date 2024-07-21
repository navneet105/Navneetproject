package Lecture9;

public class Maximum_53_SubArray_Sum {

	public static void main(String[] args) {
		// time limit exceeded kadenes algorithem
		int arr[]= {-2,1,-3,-6,4,-1,7};
		System.out.println(Maximum_Sum(arr));

	}
	public static int Maximum_Sum(int arr[]) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				ans=Math.max(ans, sum);
			}
		}
		return ans;
		
	}

}
