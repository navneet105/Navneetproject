package Lecture6;

import java.util.Scanner;

public class Nth_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(fib(n));
	}
	public static int fib(int n) {
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
			return a;
	}

}
