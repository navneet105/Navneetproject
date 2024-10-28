package LEC41;

public class p746MinCostClimbingStairs {

	public static void main(String[] args) {
		int []arr= {10,15,20};
		int zero=Min_cost(arr,0);
		int one=Min_cost(arr,1);
		System.out.println(Math.min(zero, one));
		
	}
  public static int Min_cost(int[]arr,int i) {
	  if(i>=arr.length) {
		  return 0;
	  }
	  int a=Min_cost(arr,i+1);
	  int b=Min_cost(arr,i+2);
	  return arr[i]+Math.min(a, b);
  }
}
