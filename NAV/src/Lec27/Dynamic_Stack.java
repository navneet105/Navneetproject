package Lec27;

import LEC24.*;

public class Dynamic_Stack extends Stack {
	//private datamemer kabhi nherit nhi ho skta psa chipa k 
   @Override
   public void push(int item) throws Exception {
	   if(isFull()) {
		   int[] a=new int[2*arr.length];
		   for (int i = 0; i < arr.length; i++) {
			a[i]=arr[i];
		}
		   arr=a;
	   }
	   super.push(item);
   }
   public static void main(String[]args) throws Exception {
	   
	   Dynamic_Stack ds=new Dynamic_Stack();
	   ds.push(10);
	   ds.push(20);
	   ds.push(30);
	   ds.push(40);
	   ds.Display();
   }
	
}
