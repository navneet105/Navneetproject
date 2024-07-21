package Lec2;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=5;
		int star=1;
		int space=n-1;
		int a=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			int j=1;
			int count=a;
			while(j<=star) {
				if(j<row) {
					System.out.print(count+"  ");
					count++;
				}else {
				System.out.print(count +"  ");
				count--;
				}
				
				j++;
			}
			row++;
			star+=2;
			space--;
			a++;
			System.out.println();
		}

	}

}
