package Lec16recstr;

public class subssequence {

	public static void main(String[] args) {
		String ques="abc";
		Print(ques," ");
		
		
	
	}
	public static void Print(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		Print(ques.substring(1),ans);
		Print(ques.substring(1),ans+ch);
		
	}
	

}
