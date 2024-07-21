package Lec19Back;

public class Queen_Combination {

	public static void main(String[] args) {
		int n=4;
		//we wnat to cahnge the address weare not able to do undo so we use backtraking
		boolean []board=new boolean[4];
		int tq=2;//total queen
		Combination(board,tq,0,"",0);
		
//queen place so far
	}
	public static void Combination(boolean []board,int tq,int qpsf,String ans,int idx) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				Combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				board[i]=false;
			}
		}
	}
}
