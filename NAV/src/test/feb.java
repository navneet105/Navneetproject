package test;

import java.util.Scanner;

public class feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] arr = new boolean[n][n];
		Queen(arr,n,0);
		
		
	}
	public static void Queen(boolean[][] arr,int queen, int row) {
		if(queen==0) {
			Display(arr);
			return;
		}
		
		for(int col=0; col<arr.length; col++) {
			if(isitsafe(arr,row,col)) {
			arr[row][col] = true;
			Queen(arr, queen-1, row+1);
			arr[row][col]=false;
			}
			
		}
	}
	
	public static boolean isitsafe(boolean[][] arr, int row, int col) {
		//left diagonal
		int r = row;
		int c  = col;
		while(r>=0 && c>=0) {
			if(arr[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		r=row;
		c=col;
		while(r>=0 && c<arr.length) {
			if(arr[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		r=row;
		c=col;
		while(r>=0) {
			if(arr[r][c]) {
				return false;
			}
			r--;
		}
		return true;
	}
	public static void Display(boolean[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]) {
					System.out.print("Q");
				}else {
					System.out.print(".");
				}
				
			}
			System.out.println();
		}
		return;
	}

}
