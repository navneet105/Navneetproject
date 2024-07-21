package LEC3;
import java.util.*;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int row=1;
		int star=n/2;
		int space=1;
		while(row<=n) {
			int i=1;
			//star
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			//space
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			 i=1;
			 //star
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//mirror
			if(row<n/2+1) //if(row<=n/2)
			{
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			//next row prep
			row++;
			System.out.println();
		}
		
	}

}
