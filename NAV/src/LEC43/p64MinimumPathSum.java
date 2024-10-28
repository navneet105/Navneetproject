package LEC43;

import java.util.Arrays;

public class p64MinimumPathSum {

	public static void main(String[] args) {
		int [][ ]arr= {{1,3,1},{1,5,1},{4,2,1}};
		int [][]dp=new int[arr.length][arr[0].length];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Path_sum(arr,0,0,dp));
	}
	public static int Path_sum(int[][]arr,int cr,int cc,int [][] dp) {
		if(cr==arr.length-1 && cc==arr[0].length-1) {
			return arr[cr][cc];
		}
		if(cr>=arr.length||cc>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[cr][cc]!=-1) {
			return dp[cr][cc];
		}
		int h=Path_sum(arr,cr,cc+1,dp);
		int v=Path_sum(arr,cr+1,cc,dp);
		return dp[cr][cc]=Math.min(h, v)+arr[cr][cc];
	}

}
