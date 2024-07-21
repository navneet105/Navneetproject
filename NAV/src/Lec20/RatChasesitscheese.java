package Lec20;

import java.util.*;

public class RatChasesitscheese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][]maze=new char[n][m];
		for(int i=0;i<maze.length;i++) {
			String s=sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j]=s.charAt(j);
				
			}
			
		}
		int[][]ans=new int[n][m];
		Path(maze,0,0,ans);
		if(val==false) {
			System.out.println("No Path Found");
		}

	}
	static boolean val=false;
	public static void Path(char[][]maze,int cr,int cc,int[][]ans) {
		if(cr<0||cr>=maze.length ||cc<0||cc>=maze[0].length||maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		if(cr==maze.length-1&& cc==maze[0].length-1) {
			val=true;
			Display(ans);
		}
		Path(maze,cr-1,cc,ans);//down
		Path(maze,cr,cc-1,ans);//left
		Path(maze,cr+1,cc,ans);//down
		Path(maze,cr,cc+1,ans);//right
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

}
