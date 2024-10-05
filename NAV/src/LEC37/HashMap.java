package LEC37;

import java.util.*;



public class HashMap<K,V> {
	//made evry thing in O(1)
		//colision ko kese htaye chaining method using linked list
		//linked list m add first krna hoga o(1)
		//thfactor   loadfactor 
class Node{
		K key;
		V value;
		Node next;
	}
private ArrayList <Node> bukt;
private int size=0;
public HashMap() {
	
//	bukt=new ArrayList<>();
//	for(int i=0;i<4;i++) {
//		bukt.add(null);
//	}
	this(4);
}
public HashMap(int n) {
	bukt=new ArrayList<>();
	for(int i=0;i<n;i++) {
		bukt.add(null);
	}
}
public void put(K key,V value ) {//bn bucket number
	int bn=hashfun(key);
	Node temp=bukt.get(bn);//start
	while(temp!=null) {
		if(temp.key.equals(key)) {
			temp.value=value;
		}
		temp=temp.next;
		//ye linked list ka searching ka code h
	}
	Node nn=new Node();
	nn.key=key;
	nn.value=value;
	size++;
	temp=bukt.get(bn);
	bukt.set(bn,nn);
	double thf=2.0;
	double lf=(1.0*size)/bukt.size();
	if(thf<lf) {
		rehashing();
	}
	
}
private void rehashing() {
	ArrayList<Node>new_bukt=new ArrayList<>();
	for (int i = 0; i < 2*bukt.size(); i++) {
		new_bukt.add(null);
	}
	ArrayList<Node>old_bukt=bukt;
	bukt=new_bukt;
	size=0;
	for(Node nn:old_bukt) {
		while(nn!=null) {
			put(nn.key,nn.value);
			nn=nn.next;
		}
	}
	
}
public String toString() {
	String s="{";
	for(Node nn:bukt) {
		while(nn!=null) {
			s=s+nn.key+"="+nn.value+",";
			nn=nn.next;
		}
	}
	return s+"}";
}
public V get(K key) {
	int bn=hashfun(key);
	Node temp=bukt.get(bn);//start
	while(temp!=null) {
		if(temp.key.equals(key)) {
		return temp.value;
		}
		temp=temp.next;
		
	}
	return null;
}
public boolean  containsKey(K key) {
	int bn=hashfun(key);
	Node temp=bukt.get(bn);//start
	while(temp!=null) {
		if(temp.key.equals(key)) {
		return true;
		}
		temp=temp.next;
		
	}
	return false;
}
public V remove(K key) {
	int bn=hashfun(key);
	Node curr=bukt.get(bn);
	Node prev=null;
	while(curr!=null) {
		if(curr.key.equals(key)) {
			break;
		}
		prev =curr;
		curr=curr.next;
	}
	if(curr==null) {
		return null;
	}
	else if(prev==null) {
		bukt.set(bn, curr.next);
	}else {
		prev.next=curr.next;
	}
	size--;
	return curr.value;
	
}
public int hashfun(K key) {//ye ye bteygega kaun se index p key milege hash code nilege ye integer hota  h range 
	int idx=key.hashCode();
	idx=idx%bukt.size();
	if(idx<0) {
		idx+=bukt.size();
	}
	return idx;
	
	
	
	}
}
