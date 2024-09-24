package LEC35;

import java.util.ArrayList;

// heap means priority queue but both are different 
//choti value badi priority min heap (rank) 3 left 5 right 6
//badi value badi priority max heap (marks)
//heap is complete binery tree some priority associated 
//if level is l it mean l-1 tak completely fill hona chye is called complte binery tree
public class Heap {
	private ArrayList<Integer> ll=new ArrayList<>();
	public void add(int item) {
		ll.add(item);
		upheapify(ll.size()-1);
		
	}
	private void upheapify(int ci) {
		int pi=(ci-1)/2;
		if(ll.get(pi)>ll.get(ci)) {
			swap(pi,ci);
			upheapify(pi);
		}
	}
	private void swap(int i, int j) {
		int ith=ll.get(i);
		int jth=ll.get(j);
		ll.set(i,jth);
		ll.set(j,ith);
	}
	public int getmin() {
		return ll.get(0);
	}
	public void Display() {
		System.out.println(ll);
	}
	public int size() {
		return ll.size();
	}
	public int remove() {
		int v=ll.get(0);
		swap(0,ll.size()-1);
		ll.remove(ll.size()-1);
		downheapify(0);
		return v;
	}
	private void downheapify(int pi) {
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<ll.size()&&ll.get(lci)<ll.get(mini)) {
			mini=lci;
		}
		if(rci<ll.size() &&ll.get(rci)<ll.get(mini)) {
			mini=rci;
		}
		if(mini!=pi) {
			swap(pi,mini);
			downheapify(mini);
		}
	}

}
