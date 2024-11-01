package LEC21;

public class n_queen_problem {

	public static void main(String[] args) {
		int n=4;
		boolean [][]board=new boolean[n][n];
		Print(board,n,0);

	}
	public static void Print(boolean[][] board,int tq,int row)
	{
		if(tq==0) {
			Disply(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				Print(board,tq-1,row+1);
				board[row][col]=false;
			}
		}
		
	}
	public static boolean isSafe(boolean[][] board, int row, int col) {
		//left digonal
		int r=row;
		int c=col;
		while(r>=0&& c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		//rigt diagonal
		 r=row;
		c=col;
		while(r>=0&& c<board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		//up bard
		r=row;
		c=col;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			
			r--;
		}
		return true;
	}
	public static void Disply(boolean[][]board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
