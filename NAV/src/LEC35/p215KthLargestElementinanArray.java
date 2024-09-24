package LEC35;

import java.util.PriorityQueue;

public class p215KthLargestElementinanArray {

	public static void main(String[] args) {
		int arr[]={3,2,3,1,2,4,5,5,6}  ;
		int k=3;
		

	}
	public static  int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if(pq.peek()<arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();		}

}
