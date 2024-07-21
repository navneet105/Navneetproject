package Lec13Srting;

public class String_Demo_2 {

	public static void main(String[] args) {
		// isme kuch bi kro copy bante h 
		String s1="Hello";//pool
		String s2="Hello";/pool
		String s3=new String("Hello");
		String s4=new String ("Hello");
		String s=s1+s2;  // + sign use hone ke bad pool ke baher aur uske copy heap m bnege aur usme chage add hoge 
		s1=s1+s2;//s1 ka adreess  8k ho gya ager s2 ko khi aur point kr diya to value garbage collector m chle gayege
		String str=s1+s3;
		String  strr =s1+"okey";
		String ;str1="Hello"+"Bye";//pool
		//string is immutable change kegre same location p nhi uske phle copy bnte h phir change hota h bo heap m ho heap ke baher ho
		s=s.concat(s2);
	}

}
