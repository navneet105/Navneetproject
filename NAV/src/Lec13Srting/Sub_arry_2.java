package Lec13Srting;

public class Sub_arry_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		print(s);
	}
	public static void print(String s) {
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				System.out.println(s.substring(i,j));
			}
			
		}
	}

}
