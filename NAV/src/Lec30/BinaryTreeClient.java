package Lec30;

public class BinaryTreeClient {
//protected ka inharitance package ke baher bhi ho jata h lekin defaul ka nhi hoga 
	public static void main(String[] args) {
		//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		BineryTree bt=new BineryTree();
         bt.Display();
         System.out.println(bt.min());
         System.out.println(bt.max());
         System.out.println(bt.find(10));
         System.out.println(bt.ht());
	}

}
