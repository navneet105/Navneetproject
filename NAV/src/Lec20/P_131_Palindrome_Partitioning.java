package Lec20;

import java.util.*;

public class P_131_Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="nitin";
		List<String>ll=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		Partitioning(ques,ll,ans);
		System.out.println(ans);

	}

	public  static void Partitioning(String ques,List<String>ll,List<List<String>> ans) {
		if(ques.length()==0) {
			ans.add(new  ArrayList<>(ll))
;			return;
		}
		// TODO Auto-generated method stub
		for (int i = 1; i <= ques.length(); i++) {
			String s=ques.substring(0,i);
			if(isPalindrome(s)) {
				ll.add(s);
			Partitioning(ques.substring(i),ll,ans);
			ll.remove(ll.size()-1);
			}
			
		}
		
	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1	;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			j--;
			i++;
		}
		return true;
		}

}
