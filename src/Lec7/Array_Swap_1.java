package Lec7;

public class Array_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,5,6,7,8};
		//int ar[]= new int[]{10,20,5,6,7,8};
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr[0],arr[1]);//swap method ke fuction ke local variable m change hua h stack udega to koi fark pdega isme arry nhi bheja khali local variable bhajea a
		System.out.println(arr[0]+" "+arr[1]);

	}
	public static void Swap(int a,int b) {
		int temp=a;
		b=a;
		b=temp;
	}

}
