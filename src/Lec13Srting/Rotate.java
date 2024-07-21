package Lec13Srting;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		  long n=sc.nextLong();
		System.out.println(sqrt(n));
		    }
		    public static long sqrt(long n){
		        if(n==0||n==1){
		            return n;
		        }
		        long i=1;
		        long j=n;
		        long ans=0;
		        while(i<=j){
		            long mid=i+(j-i)/2;
		            if(mid*mid==n){
		                 //ans=mid;
		                return mid;
		            }else if(mid*mid>n){
		                
		                j=mid-1;
		               
		            }
		            else{
		                i=mid+1;
		                ans=mid;
		            }

		        }
		        return ans;
		        

	    }

	}


