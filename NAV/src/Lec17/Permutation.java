package Lec17;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		print(ques,"");

	}
	public static void print (String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String s1=ques.substring(0,i);
			System.out.print(s1+"  ");
			String s2=ques.substring(i+1);
			System.out.print(s2+"  ");
			print(s1+s2,ans+ch);
		}
	}

}