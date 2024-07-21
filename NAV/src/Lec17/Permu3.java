package Lec17;

public class Permu3 {

	public static void main(String[] args) {
		String ques="abac";
		System.out.println(IsPresent(ques,'a',2));
		

	}
	public static boolean IsPresent(String s,char ch,int i) {
		for(int j=i;j<s.length();j++) {
			if(s.charAt(j)==ch) {
				return true;
			}
		}
		return false;

	}

}
