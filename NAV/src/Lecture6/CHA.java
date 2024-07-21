package Lecture6;

import java.util.Scanner;

public class CHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        Min_Num( n);
	    }
	    public static int Count_Num(int n){
	        int count=0;
	        while(n>0){
	            n=n/10;
	            count++;
	        }
	        return count;
	    }
	    public static void Min_Num(int n){
	        int index=1;
	        int sum=0;
	        int c=Count_Num(n);
	        int count=1;
	        while(n>0){
	            int new_dig;
	            
	            int rem=n%10;
	            new_dig=9-rem;
	           if(count !=c && new_dig!=0){
	            if(new_dig<rem){
	                rem=new_dig;
	            }}
	            sum=sum+index*rem;
	            index*=10;
	            n=n/10;
	            count++;
	        }
	        System.out.println(sum);

	}

}
