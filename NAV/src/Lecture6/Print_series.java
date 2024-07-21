package Lecture6;

import java.util.Scanner;

public class Print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n=1;
        int n2=sc.nextInt();
        int count=0;
        int num;
        while(count<n1) {
        	num=3*n+2;
        	if(num%n2!=0) {
        		System.out.println(num);
        		count++;
        	}
        	n++;
        	
        }


	}

}
