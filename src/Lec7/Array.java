package Lec7;

import java.util.Scanner;

public class Array {

	public static void main(String []args) {
		
		int [] arr= {10,20,30,40};
		int []other={10,20,30,40};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr, other);
		System.out.println(arr[0]+" "+arr[1]);
		
	}
	
    public static void swap(int []arr,int[] other) {
    	int[]temp=arr;
    	arr=other;
    	other=temp;
    }
}
