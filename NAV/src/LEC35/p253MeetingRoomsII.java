package LEC35;

import java.util.*;

public class p253MeetingRoomsII {
// meeting chlege prorty queue m aur end ko dekhege      aur start ke baher short krege 
	public static void main(String[] args) {
		int [][] intervels= {{0, 30},{5, 10},{15, 20}};
        System.out.println(minRooms(intervels));
	}
	public static  int minRoom(int[][] intervels) {
		Arrays.sort(intervels,(a,b)->a[0]-b[0]);//a,b are row and 0 is index of row  lemda expression
		for (int i = 0; i < intervels.length; i++) {
			for (int j = 0; j < intervels[0].length; j++) {
				System.out.print(intervels[i][j]+" ");
			}
			System.out.println();
		}
		return 0;
	}
	public static  int minRooms(int[][] intervels) {
		Arrays.sort(intervels,(a,b)->a[0]-b[0]);//a,b are row and 0 is index of row  lemda expression
		PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
		pq.add(intervels[0]);
		int count=1;
		for (int i = 1; i < intervels.length; i++) {
			if(pq.peek()[1]>intervels[i][0]) {//end  last start chota h
				pq.add(intervels[i]);
				count=Math.max(count, pq.size());
			}else {
				pq.poll();
				pq.add(intervels[i]);
			}
		}
		return count;
	}

}
