package Lecture6;

import java.util.Scanner;

public class Armstrong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(IsArmstrong( n));
	}
	public static boolean IsArmstrong(int n) {
		int d=count_of_digit(n);
		int sum =0;
		int temp =n;
		while(n>0) {
			int rem=n%10;
			sum = (int)(sum+ Math.pow(rem, d));
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}else {
			return false;
		}
		
	}
	public static int count_of_digit(int n) {// int is lye likha print krana motive nhi h hme iska use krna h
		 int count =0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	

}
