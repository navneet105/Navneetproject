package LEC42;

public class Knapshak {

	public static void main(String[] args) {
		int cap=4;
		int []wt= {1,2,3,2,2};
		int val[]= {8,4,0,5,3};
		System.err.println(Knapsck(wt,val,cap,0));
		
	}
	public static int Knapsck(int [] wt, int [] val,int cap,int i) {
		if(cap==0||i==wt.length) {
			return 0;
		}
		int inc=0,exc=0;
		if(cap>=wt[i]) {
			inc=val[i]+Knapsck(wt,val,cap-wt[i],i+1);
		}
		exc=Knapsck(wt,val,cap,i+1);
		return Math.max(inc, exc);
	}

}
