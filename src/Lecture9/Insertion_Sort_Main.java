package Lecture9;

public class Insertion_Sort_Main {

	public static void main(String[] args) {
		//sahi line m galat ho to   
    int arr[]= {2,3,8,5,11,9,12,6};
    sort(arr);
    
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
	}
    public static void sort(int arr[]) {
    	for(int i=1;i<arr.length;i++) {
    		Insert_Last_Element( arr,i);
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
