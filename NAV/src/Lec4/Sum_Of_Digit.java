package Lec4;

import java.util.Scanner;

public class Sum_Of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int sum=0;
		while(n!=0) {//n>0
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);

	}

}
