package Lec29;
//floyd cyle detection   hasCycle
//
public class Cycle_removal {
	private class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addLast(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getNode(int k)  {
	
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle()  {
		tail.next = getNode(2);
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}
	 public Node hasCycle() {
	        Node slow=head;
	        Node fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow==fast){
	                return slow;
	            }
	        }
	        return null;
	    }
	 //oN2
	 public void remove_Cycle1() {
		 Node meet=hasCycle();
			 if(meet==null) {
				 return;
			 
		 }
		 Node start=head;
		 while(start!=null) {
			 Node temp=meet;
			 while(temp.next!=meet) {
			 if(temp.next==start) {
				 temp.next=null;
			 }
			 temp=temp.next;
		 }
			 start=start.next;
		 }
	 }
	 //o(n) this is not a flyd cycle removal algorithm
	 public void remove_Cycle2() {
		 Node meet=hasCycle();
		 if(meet==null) {
			 return;
		 
	 }
		 //count of node in cycle 
		 int c=1;
		 Node temp=meet;
		 while(temp.next!=null) {
			 c++;
			 temp=temp.next;
		 }
		 //Move c distance fast node
		 Node fast=head;
		 for (int i = 0; i < c; i++) {
			fast=fast.next;
		}
		 Node start=head;
		 while(start.next!=fast.next) {
			 start=start.next;
			 fast=fast.next;
		 }
		 fast.next=null;
	 }
	 public void floyed_Cycle() {
		 Node meet=hasCycle();
			if(meet==null) {
				return;
			}
		 
		 Node fast=meet;
		 Node start=head;
		 while(start.next!=fast.next) {
			 start=start.next;
			 fast=fast.next;
		 }
		 fast.next=null;
	 }
	public static void main(String[] args) throws Exception {
		Cycle_removal cl = new Cycle_removal();
		cl.addLast(1);
		cl.addLast(2);
		cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);
		cl.CreateCycle();
		cl.Display();
	}

}