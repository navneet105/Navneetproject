package Lec13Srting;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		System.out.println(is_Palind( s));

	}
	public static boolean is_Palind(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
