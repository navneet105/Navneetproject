package LEC3;
import java.util.*;// util is a package
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
   int n=sc.nextInt();
   int row=1;
   int star=1;
   while(row<=2*n-1) {
	   int i=1;
	   //star
	   while(i<=star) {
		   System.out.print("* ");
		   i++;
	   }
	   if(row<n) {
		   star++;
	   }else {
		   star--;
	   
	   }
	   //next prep
	   row++;
	  
	   System.out.println();
	   
   }
   
	}

}
