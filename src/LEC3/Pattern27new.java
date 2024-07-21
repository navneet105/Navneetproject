package LEC3;

public class Pattern27new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=5;
		int star=1;
		int space=n-1;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			int j=1;
			int count=1;
			while(j<=star) {
				System.out.print(count +"  ");
				//mirror
				if(j<=star/2) {
				count++;}else {count--;};
				
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}


	}

}
