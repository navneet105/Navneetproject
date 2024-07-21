package Lec4;

import java.util.Scanner;

public class Check_Prime_Using_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;//jis loop m lga h use se baher ayega beacuse one factor is sufficient to find the factor
			}
			
		}
		if(count>=1) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime ");
		}

	}

}
