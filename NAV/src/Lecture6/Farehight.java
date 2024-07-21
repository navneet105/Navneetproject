package Lecture6;

import java.util.Scanner;

public class Farehight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Min_F=sc.nextInt();
		int Max_F=sc.nextInt();
		int step=sc.nextInt();
		for (int faren = Min_F; faren <= Max_F; faren += step) {
            int celsius = con_F_C( faren) ;
            System.out.println(faren +"\t" +celsius);
        }
		

	}
	public static int con_F_C(int faren) {
		return (5/9)*(faren-32);
	}

}
