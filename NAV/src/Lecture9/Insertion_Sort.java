package Lecture9;

public class Insertion_Sort {

	public static void main(String[] args) {
		//sahi line m galat ho to
    int arr[]= {2,3,5,8,9,1,12,6};
    Insert_Last_Element( arr,arr.length-1);
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }

}
	
	public static void Insert_Last_Element(int arr[],int i) {
		int item=arr[i];
		int j=i-1;
		while(j>=0&& arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
		
	}
}