package Lec25;

import java.util.Stack;

public class Reverse_Element {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);

	}
	public static void Reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int x=st.pop();
		Reverse(st);
		Insert(st,x);//push-->last me element add kr rha h
		
	}
	public static void Insert(Stack<Integer> st,int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int i=st.pop()
;
		Insert(st,item);
		st.push(i);
		}

}
