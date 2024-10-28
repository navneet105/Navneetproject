package LEC42;

import java.util.Arrays;

public class p115DistinctSubsequences {

	public static void main(String[] args) {
		String s="rabbbit";
		String t="rabbit";
				int [][]dp=new int[s.length()][t.length()+1];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
	}
	//s-->coin t-->amount i-->s j--t
	public static int Coin_Change(String s,String t,int i,int j ,int[][]dp) {
		if(j==t.length()) {//amount==0
			return 1;
		}
		if(i==s.length()) {//coin khatam
			return 0;
		}
		int inc=0,exc=0;
		if(s.charAt(i)==t.charAt(j)) {
			inc=Coin_Change(s,t,i+1,j+1,dp);
		}
		exc=Coin_Change(s,t,i+1,j,dp);
		return dp[i][j]=inc+exc;
	}
}
