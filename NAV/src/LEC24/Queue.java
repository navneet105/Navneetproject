package LEC24;

import java.util.Iterator;

public class Queue {
//fifo
	protected int[]arr;
	private int size=0;
	protected int front=0;
	public Queue() {
		arr=new int[5];
	}
	public Queue(int n) {
		arr=new int[n];
	}
	public boolean isEmpty() {
		return size==0;
	}
   public boolean isFull() {
		return size()==arr.length;
	}
   public void Enqueue(int item)throws Exception{
	   if(isFull()) {
		   throw new Exception("Quee full");
	   }
	   int idx=(front+size)%arr.length;
	   arr[idx]=item;
	   size++;
   }
   public int getFront()throws Exception {
	   if(isEmpty()) {
		   throw new Exception("Quee emty");
	   }

	   int v=arr[front];
	   return v;
   }
   public int dequeue()throws Exception {
	   if(isEmpty()) {
		   throw new Exception("Quee emty");
	   }

	   int v=arr[front];
	   front=(front+1)%arr.length;
	   //front++;
	   size--;
	   return v;
   }
   public int size() {
		return size;
	}
   public void Display() {
	   for (int i = 0; i < size; i++) {
		int idx=(front+i)%arr.length;
		System.out.print(arr[idx]+" ");
	}
	   System.out.println();
   }
}

