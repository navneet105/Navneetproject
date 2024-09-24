package Lecture9;

import java.util.Arrays;
import java.util.*;

public class BUSYMAN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt()
;
		Pair[]arr=new Pair[n];
		for (int i = 0; i < arr.length; i++) {
			int st=sc.nextInt();
			int et=sc.nextInt();
			arr[i]=new Pair(st,et);//inner class ka object bna rh hos staic krna pdega
		}
		Arrays.sort(arr,new Comparator<Pair>() {
			@Override
		public int compare(Pair o1,Pair o2) {
			return o1.et-o2.et;
		}
		});
		int activities=1;
		int end=arr[0].et;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].st>=end) {
				activities++;
				end=arr[i].et;
			}
		}
		System.out.println(activities);
	}
		}
	static class Pair{// here we do static in this care ager hme inner call ka access krna h 
		int st;
		int et;
		public Pair(int st,int et) {
			this.st=st;
			this.et=et;
		}
	}

}
