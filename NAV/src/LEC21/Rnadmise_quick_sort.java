package LEC21;

import java.util.Iterator;
import java.util.Random;

public class Rnadmise_quick_sort {

	public static void main(String[] args) {
		int arr[]= {5,7,2,1,8,3,4};
		Sort(arr, 0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Sort(int[]arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int idex=Partition(arr,si,ei);
		Sort(arr,si,idex-1);
		Sort(arr,idex+1,ei);
	}
	public static int Partition(int[] arr, int si, int ei) {
		Random rn=new Random();
		int ri=rn.nextInt(ei-si+1)+si;
		int t=arr[ri];
		arr[ri]=arr[ei];
		arr[ei]=t;
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
