package LEC24;

import java.util.Stack;

public class Stack_Java {
//lifo
	//there is no indexing in stack
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());//50
		System.out.println(st.pop());//50
        System.out.println(st.peek());//40
        System.out.println(st);
        for(int v:st) {
        	System.out.print(v+" ");
        }
	}

}
