package Lec30;

import java.util.*;

public class BineryTree {
	class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc=new Scanner(System.in);
    public BineryTree() {
    	root =CreateTree();// create tree krke address dede root ka
    }
	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item=sc.nextInt();
		Node nn=new Node();
		nn.val=item;
		boolean hlc=sc.nextBoolean();
		if(hlc) {
			nn.left=CreateTree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc) {
			nn.right=CreateTree();
		}
		return nn;
		}
	public void Display() {
		Display(root);
	}
	private void Display(Node nn) {
		if(nn==null) {
			return;
		}
		String str="";
		str="<--"+nn.val+"-->";
		if(nn.left!=null) {
			str=nn.left.val+str;
		}else {
			str="."+str;
		}
		if(nn.right!=null) {
			str=str+nn.right.val;
		}else {
			
			str=str+".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}
	public int max() {
		return max(root);
	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int l=max(nn.left);
		int r=max(nn.right);
		return Math.max(nn.val, Math.max(l,r));
	}
	public int min() {
		return min(root);
	}
	private int min(Node nn) {
		if(nn==null) {
			return Integer.MAX_VALUE;
		}
		int l=min(nn.left);
		int r=min(nn.right);
		return Math.min(nn.val, Math.min(l,r));
	}
	public boolean find(int item) {
		return find(root,item);
	}
	private boolean find(Node nn, int item) {
		if(nn==null) {
			return false ;
		}
		if(nn.val==item) {
			return true;
		}
		boolean l=find(nn.left,item);
		boolean r=find(nn.right,item);
		return l||r;
	}
	public int ht() {
		return ht(root);
	}
	private int ht(Node node) {
		if(node==null) {
			return -1;
		}
			int lh=ht(node.left);
		int rh=ht(node.right);
		return Math.max(lh, rh)+1;
		}
	public void preOrder() {
		preOrder(this.root);
		System.out.println();
	}
	private void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.val+" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	public void postOrder() {
		postOrder(this.root);
		System.out.println();
	}
	private void postOrder(Node node) {
		if(node==null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val+" ");
	}
	public void inOrder() {
		inOrder(this.root);
		System.out.println();
	}
	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.val+" ");
		inOrder(node.right);
		
	}
	public void levelOrder() {
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv=q.poll();//q.remove();//remove first
			System.out.print(rv.val+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
	
	
}
