package Lec28;

public class LinkedList {
//last linear data structure
	//os 
	//collection of node is linklist
	class Node{
		int val;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	//o(1)
	public void addfirst(int item) {
		Node nn=new Node();//making new node
		nn.val=item;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	public void addlast(int item) {
		if(size==0) {
			addfirst(item);
		}else {
			Node nn=new Node();
			nn.val=item;
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"---->");
			temp=temp.next;
		}
		System.out.println(".");
	}

}
