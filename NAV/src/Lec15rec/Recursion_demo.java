package Lec15rec;
//season 2

public class Recursion_demo {

	public static void main(String[] args) {
		// function calling  itself 
		//PMI-prnciple of mathmatical indection (mathmatical equation ko proofa)
		// 1st rule we know small input
		//2nd formula case k input ke lye ans is coorect 
		//k+1 proof kr do 
		//3rd smaller problem ka use and self se krke proof kr diya ans ko very fy krege
		//5!=4!*5;
		//10000 approx fxn frame bna sakte h
		int n=5;
		System.out.println(fac(n));

	}
	public static int fac(int n) {
		if(n==0) {
			return 1;
		}
		int fn=fac(n-1);//small problem
		return fn*n;//self work
	}

}
