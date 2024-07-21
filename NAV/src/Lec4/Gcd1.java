package Lec4;

public class Gcd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int divdend=60;
      int divisor=36;
      
      while(divdend%divisor!=0) {
    	  int rem=divdend%divisor;
    	  divdend=divisor;
    	  divisor=rem;
    	  
      }
      System.out.println(divisor);
      
	}

}
