	package LEC35;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Client {

	public static void main(String[] args) {
		//Heap hp=new Heap();
		//PriorityQueue<Integer>hp=new PriorityQueue<>();//min heap
		PriorityQueue<Integer>hp=new PriorityQueue<>(Collections.reverseOrder());//max heap
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		//hp.Display();
		System.out.println(hp);
		System.out.println(hp.remove());
//hp.Display();
		System.out.println(hp);
	}

}