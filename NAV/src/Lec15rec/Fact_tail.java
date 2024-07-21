package Lec15rec;
// recursion se bapus aate kuch nhi kr rh ho tail
public class Fact_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fac(n,1));

	}
	//pahle cal fir recusion   head hoga
	public static int fac(int n,int ans) {
		if(n==0) {
			return ans;
		}
	
		
		return  fac(n-1,ans*n);
	}


	

}
