package Lec16recstr;

public class Coin_Toss {

	public static void main(String[] args) {

int n=3;
Print(n," ");

	}
	public static void Print(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		Print(n-1,ans+"H");
		Print(n-1,ans+"T");
	}

}
