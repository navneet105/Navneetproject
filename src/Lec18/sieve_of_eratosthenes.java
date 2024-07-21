package Lec18;

public class sieve_of_eratosthenes {

	public static void main(String[] args) {
		int n=100;
		System.out.println(Sieve_Prime(n));

	}
	//0--index prime number hoga
	//1--index not prime number
	public static int Sieve_Prime(int n) {
		int []prime=new int[n+1];
		prime[0]=1;//not prime number
		prime[1]=1;//not prime number
		for(int i=2;i*i<=prime.length;i++) {
			if(prime[i]==0) {
				for(int j=2;i*j<prime.length;j++) {
					prime[i*j]=1;
				}
			}
		}
		int c=0;
		for (int i = 0; i < prime.length; i++) {
			if(prime[i]==0) {
				c++;
			}
		}
		return c;
	}

}
