package test;

public class recu {

	public static void main(String[] args) {
		int n=5;
		int i=4;
		//System.out.println(rec(n));
		rec(n);

	}
	public static void rec(int n) {
		if(n==0) {
			return;
		}
	
		rec(n-1);
		System.out.println(n);lifo
		
	}

}
