package Lec17;

public class Laxico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		Print(0,n);

	}
	public static void Print(int curr,int end) {
		if(curr>end) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i= 1;
		}
		for(;i<=9;i++) {
			Print(curr*10+i,end);
		}
	}

}
