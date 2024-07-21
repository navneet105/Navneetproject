package Lec4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			//if(i==n) {
		//	System.out.println(a);}
		}
		System.out.println(a);

	}

}
