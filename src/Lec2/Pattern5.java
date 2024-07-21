package Lec2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=1;
		int n=5;
		int star =n;
		int space=0;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//next row prep
			row++;
			space++;
			star--;
				System.out.println();
		}

	}

}
