package test;

public class feb {

	public static void main(String[] args) {
		int n=2;
		int start=(int)Math.pow(10, n-1);
		int end=(int)Math.pow(10,n)-1;
		fPrime( n, start, end);
		

	}
	public static void fPrime(int n,int start,int end) {
		if(start>end) {
			return;
		}else if(isPrime( start)) {
			System.out.println(start);
			fPrime(n,start+1,end);
		}else {
			fPrime(n,start+1,end);
		}
		
	}
	public static boolean isPrime(int n) {
		return isPri(n,2);
	}
//	public static int isPrime(int n,int o,int c) {
//	
//		if(o>=n) {
//			return c;
//		}
//		if(isPri(o,2)) {
//			System.out.println(o);
//		 }
//		return isPrime( n, o+1,c);
//		 
//	}
	
	public static boolean isPri(int n,int i) {
		if(i*i>n) {
			return true;
		}
		else if(n%i==0) {
			return false;
		}else {
			return isPri(n,i+1);
		}
	}

}
