package Lec2;

public class Patteren31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=n;
		int a=5;
		
		while(row<=n) {
			int i=1;
			int count=5;
			while(i<=star) {
				if(i==a) {System.out.print("*");
				
				}
				else {
			System.out.print(count--);}
			
			i++;
			}
			row++;
			a--;
			System.out.println();

		}
		
	}

}
