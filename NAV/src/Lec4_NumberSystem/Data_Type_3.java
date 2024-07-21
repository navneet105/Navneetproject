package Lec4_NumberSystem;

import java.util.Scanner;

public class Data_Type_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char 256  0 to 255 ASCII VALUE
		char ch='a';
		System.out.println(ch);
		ch++;// ch=(char)(ch+1)
		System.out.println(ch);
		
		ch=(char)(ch+1);// java support 2^16 but all are not reserved
		Scanner sc=new Scanner(System.in);
		
		ch=sc.next().charAt(0);
		

	}

}
