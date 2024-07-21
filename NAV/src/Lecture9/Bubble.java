package Lecture9;

public class Bubble {

	public static void main(String[] args) {
		// we have to shift the largest data in the  right side .(doing comprasion).
		int arr[]= {4,5,2,3,1};
		BubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void BubbleSort(int [] arr) {
		for(int turn=1;turn<arr.length;turn++) { //ye kitne bar chl total kitne step follow ki 
			for(int i=0;i<(arr.length-turn);i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
		}
	}

}
