package Lec122darray;

import java.util.Iterator;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		Print(arr);
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j]+ " ");		}
//			System.out.println();
//		}
		

	}
	public static void Print(int[][]arr) {
		int minc=0,minr=0;
		int maxc=arr[0].length-1,maxr=arr.length-1;
		while(minc<=maxc && minr<=maxr) {
		for(int i=minc;i<=maxc &&  minr<=maxr;i++) {
			System.out.print(arr[minr][i]+" ");
		}
		minr++;
		for(int i=minr;i<=maxr&&minc<=maxc;i++) {
			System.out.print(arr[i][maxc]+" ");
		}
		maxc--;
	
	for(int i=maxc;i>=minc&&minr<=maxr;i--) {
		System.out.print(arr[maxr][i]+" ");
	}
	maxr--;
	for(int i=maxr;i>=minr&& minc<=maxc;i--) {
		System.out.print(arr[i][minc]+" ");
	}
	minc++;
	}
	}
}
