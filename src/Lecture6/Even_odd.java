package Lecture6;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int rem;
		int sum=0;
		
		int even_sum=0;
		int odd_sum=0;
		while(sc.hasNextInt()){
		      int n=sc.nextInt();
		while(n!=0) {//n>0
			rem=n%10;
			if(rem%2==0) {
				even_sum+=rem;
				
			}else {
				odd_sum+=rem;
			}
			
			n=n/10;
			
		}
		if(even_sum%4==0  || odd_sum%3==0) {
			System.out.println("Yes");
		}else {
		
		System.out.println("No");}
	}

}}
