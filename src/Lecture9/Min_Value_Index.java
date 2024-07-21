package Lecture9;

public class Min_Value_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,-1,5,3,2,1};
		System.out.println(Min_Index(arr,0));

	}
	public static int Min_Index(int arr[],int idx) {
		int mini=idx;
		for(int i=idx+1;i<arr.length;i++) {
			if(arr[i]<arr[mini]) {
				mini=i;
			}
		}
		return mini;
	}

}
