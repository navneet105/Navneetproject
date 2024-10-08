package LEC36;

import java.util.PriorityQueue;

public class MinimumSumPair {

	public static void main(String[] args) {
		// greedy approch her step m best solution pakdo bussy man 
		int[]arr= {2,4,1,4,3,2,4};
		System.out.println(Minimum_sum(arr));
	}
	public static int Minimum_sum(int arr[]) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum=0;
		while(pq.size()>1) {
			int a=pq.poll();
			int b=pq.poll();
			sum+=(a+b);
			pq.add(a+b);
		}
		return sum ;
	}

}
