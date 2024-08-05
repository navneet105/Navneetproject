package LEC21;

import java.util.Iterator;

public class Partition_in_array {

	public static void main(String[] args) {
		int arr[]= {5,7,2,1,8,3,4};
		System.out.println(Partition(arr,0,arr.length-1));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int []arr,int si,int en) {
		int idx=Partition(arr,si,en);
		sort(arr,si,idx-1);
		sort(arr,idx+1,en);
		
	}

	public static int Partition(int[] arr, int si, int ei) {
		int item=arr[ei];
		int idx=si;
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				int temp=arr[idx];
				arr[idx]=arr[i];
				arr[i]=temp;
				idx++;
			}
		}
		int temp=arr[idx];
		arr[idx]=arr[ei];
		arr[ei]=temp;
		return idx;
	}

}
