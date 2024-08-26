package Lec25;

import java.util.Stack;

public class p_2375Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
    String s="IIDID";
    System.out.println(Number(s));

	}

	public static String Number(String s) {
		int []ans=new int[s.length()+1];
		int c=1;
		Stack<Integer> st=new Stack<>();
		for (int i = 0; i <= s.length(); i++) {
			if(i==s.length()||s.charAt(i)=='I') {
				ans[i]=c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()]=c++;
				}
			}else {
				st.push(i);
			}
			
		}
		String str="";
		for(int i:ans) {
			str=str+i;
		}
		return str;
	}

}
