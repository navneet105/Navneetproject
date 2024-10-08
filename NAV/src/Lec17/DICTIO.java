package Lec17;

import java.util.*;

public class DICTIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        TreeSet<String> result = new TreeSet<>();
        StringPermutation(str,"",result);
        for (String s : result) {
            if (s.compareTo(str) > 0) {
                System.out.println(s);
            }
        }
    }
    public static void StringPermutation(String que, String ans,TreeSet<String> result) {
        if(que.length()==0) {
            result.add(ans);
            return;
        }
        for(int i=0;i<que.length();i++) {
            char ch= que.charAt(i);
            String s1 = que.substring(0,i);
            String s2 = que.substring(i+1);
            StringPermutation(s1+s2, ans+ch,result);   
        }

	}

}
