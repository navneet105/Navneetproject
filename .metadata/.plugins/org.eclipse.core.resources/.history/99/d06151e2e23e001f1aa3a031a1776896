package Lec17;
import java.util.*;
public class Generate_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=3;
    List<String>ll=new ArrayList<>();
    Paranthsis(n,0,0,"",ll);
    System.out.println(ll);
	}
	
	public static void Paranthsis(int n,int open,int close,String ans,List<String>ll) {
		if(open ==n && close==n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open>n||close>open) {
			return;
		}
		Paranthsis(n,open+1,close,ans+"(",ll);
		Paranthsis(n,open,close+1,ans+")",ll);
	}

}
