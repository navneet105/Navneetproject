package Lec4_NumberSystem;

import java.util.Scanner;

public class dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        long n = scanner.nextLong();
	        long temp = 0;
	        long mul = 1;

	        while (n > 0) {
	            long dig = n % 10;
	            if (dig == 0) {
	                dig = 5;
	            }
	            temp =temp+ dig * mul;
	            mul =mul* 10;
	            n /= 10;
	        }

	        
	        if (temp == 0) {
	            temp = 5;
	        }

	        System.out.println(temp);
    

	}

}
