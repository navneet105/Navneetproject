package Lec15rec;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		PI(n);
	}
	//pahle mera kaam hoga phir recursion1
	public static void PI(int n) {
		
		if(n==0) {
			return;
		}
		//tell   fifo
		System.out.println(n);
		PI(n-1);
		
	}
}
