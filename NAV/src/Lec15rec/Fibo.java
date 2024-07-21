package Lec15rec;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=6;
   System.out.println(fib(n));
   //call stack 
   //recursion tree
	}
	//2 logo ka ans pta hona chye f(0)=f(-1)+f(-2)
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		int f1=fib(n-1);
		int f2=fib(n-2);
		return f1+f2;
		
	}

}
