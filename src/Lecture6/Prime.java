package Lecture6;
import java.util.*;
public class Prime {
	
	
	    public static void main(String args[]) {
	   Scanner sc= new Scanner(System.in);
	   int n=sc.nextInt();
	   Is_Prime(n);
	       }
	    public static void Is_Prime(int n){
	    int count=0;
	    for(int i=2;i<n;i++){
	        if(n%i==0){
	            count++;
	            break;
	        }
	        if(count>0){
	      System.out.println("Not Prime");
	        }else{
	             System.out.println("Prime");
	        }
	    }
	    

	}
}
