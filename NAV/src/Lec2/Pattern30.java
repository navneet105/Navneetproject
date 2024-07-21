package Lec2;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=n;
		
		while(row<=n) {
			
			int i=1;
			int count=5;
			while(i<=star) {
			System.out.print(count--);
			i++;
			}
			row++;
			
			System.out.println();

		}
		
	}

}
