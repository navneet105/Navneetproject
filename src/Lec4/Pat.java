package Lec4;

import java.util.Scanner;

public class Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter number of rows: ");
		        int N = scanner.nextInt(); //total rows

		        int i = 1, j;
		        while (i <= N) {
		            j = 1;
		            while (j <= N - i) {
		                System.out.print(" ");
		                j++;
		            }
//i=row,j==i,
		            j = 1;
		            while (j <= N) {
		                if (i == 1 || i == N || j == 1 || j == N || j == (N - i + 1)) {
		                    /* Print star for 1st and Nth row and column */
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		                j++;
		            }

		            System.out.println();
		            i++;
		        }

		        scanner.close();
		    

	}

}
