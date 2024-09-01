package Lec29;

import java.util.LinkedList;

public class java_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(1,-9);
		
		System.out.println(ll);
		for(int val:ll) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println(ll.get(1));
		System.out.println(ll.remove());
	//	System.out.println(ll.removeFirst());
	//	System.out.println(ll.remove(0));

	}

}
