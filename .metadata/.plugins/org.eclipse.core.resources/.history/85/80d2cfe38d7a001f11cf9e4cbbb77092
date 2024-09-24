package LEC34;

public class LinkedList<T> {
//last linear data structure
	// os
	// collection of node is linklist
	class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// o(1)
	public void addfirst(T item) {
		Node nn = new Node();// making new node
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// o(N)
	public void addatindex(T item, int k) {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node prev = GetNode(k - 1);
			Node nn = new Node();// making new node
			nn.val = item;
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	public void addlast(T item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "---->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// o(n)
	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// o(1)
	public T getFirst() {
		return head.val;
	}

	// o(1)
	public T getlast() {
		return tail.val;
	}

	// o(N)
	public T getatindex(int k) {
		return GetNode(k).val;
	}

	public T removeFirst() {
		T val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return val;
	}

	public T removelast() {
		if (size == 1) {
			return removeFirst();
		} else {
			Node prev = GetNode(size - 2);
			T v = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return v;
		}
	}

	public T removeatindex(int k) {
		if (k == 0) {
		return	removeFirst();
		} else if (k == size - 1) {
		return	removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = GetNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}

	}

	public static void main(String[] args) {
   LinkedList<String>ll=new LinkedList<>();
   ll.addlast("Raj");
   ll.addlast("Raju");
   ll.addlast("NAv");
   ll.Display();
   
   
	}
}
