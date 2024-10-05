package LEC36;

import java.util.*;

public class p128LongestConsecutiveSequence {

	public static void main(String[] args) {
		int []arr= {0,3,7,2,5,8,4,6,0,1,12,13,14};
		System.out.println(LongestConsecutive(arr));
	}
	public static int LongestConsecutive(int[]arr) {
		HashSet<Integer> set=new HashSet<>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i]) && !set.contains(arr[i]-1)) {
				int c=0;
				int v=arr[i];
				while(set.contains(v)) {
					c++;
					set.remove(v);
					v++;
				}
				ans=Math.max(ans,c);
				
			}
		}
		return ans;
	}

}
