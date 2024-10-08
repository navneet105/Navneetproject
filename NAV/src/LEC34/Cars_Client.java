package LEC34;

import java.util.*;

public class Cars_Client {

	public static void main(String[] args) {
		Cars[]arr=new Cars[5];
		arr[0] = new Cars(200, 10, "White");// P S C
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		Arrays.sort(arr,new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {//fort this and second other
				return o1.price-o2.price;
			}
			
		});
		//BubbleSort(arr);
   Display(arr);
   
	}
	public static <T extends Comparable<T>>void BubbleSort(T [] arr) {//comparable ka bound lga diya ulta sedha t nhi aayega aayega bhi jisme combarable ka t h
		for(int turn=1;turn<arr.length;turn++) { //ye kitne bar chl total kitne step follow ki 
			for(int i=0;i<(arr.length-turn);i++) {
				if(arr[i].compareTo(arr[i+1])>0) {//adreess
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
		}
	}
	
	public static<T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	
	}

}
