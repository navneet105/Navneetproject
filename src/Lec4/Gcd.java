package Lec4;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int divdend=60;
      int divisor=36;
      
      for(;divdend%divisor!=0;) {
    	  int rem=divdend%divisor;
    	  divdend=divisor;
    	  divisor=rem;//rem assign to divisor
    	  
      }
      System.out.println(divisor);
      
	}

}
