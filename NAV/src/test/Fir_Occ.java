package test;

public class Fir_Occ {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,8,8,5};
		int item=5;
		
    System.out.println(print(arr,item,0));
	}
	public static int print(int arr[],int item,int i) {
		if(i>=arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
			}
		return print(arr,item,i+1);
	}

}
