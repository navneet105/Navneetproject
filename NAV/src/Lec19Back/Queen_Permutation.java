package Lec19Back;

import java.util.Iterator;

public class Queen_Permutation {

	public static void main(String[] args) {
		int n=4;
		//we wnat to cahnge the address weare not able to do undo so we use backtraking
		boolean []board=new boolean[4];
		int tq=2;//total queen
		Permutation(board,tq,0,"");
		
//queen place so far
	}
	public static void Permutation(boolean []board,int tq,int qpsf,String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				Permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				board[i]=false;
			}
		}
	}

}
