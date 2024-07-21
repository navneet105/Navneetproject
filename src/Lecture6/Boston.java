
package Lecture6;

import java.util.Scanner;

public class Boston {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp1=prime_fac( n);
		int temp2=Sum_of_num( n);
		//System.out.println(temp1);
		if(temp1==temp2) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

		
	}
	public static int  prime_fac(int n) {
		//number div 2
		int s1=0;
		while(n%2==0) {
			s1+=2;
			n=n/2;
		}
		//odd number even
		int i=3;
		while(i*i<=n) {
			while(n%i==0) {
				s1+=i;
				n=n/i;
			}
			i+=2;
		}
		if(n>2) {
			s1+=n;
		}
		return s1;
		
		
		
	}
	public static int  Sum_of_num(int n) {
		int rem;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		return sum;
	}

}
