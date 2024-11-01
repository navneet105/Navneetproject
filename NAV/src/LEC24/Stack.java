package LEC24;

public class Stack {
		protected int[]arr;
		private int idx=-1;
		public Stack() {
			arr=new int[5];
		}
		public Stack(int n) {
			arr=new int[n];
		}
		public boolean isEmpty() {
			return idx==-1;
		}
       public boolean isFull() {
			return size()==arr.length;
		}
     public void push(int item) throws  Exception{
    	 if(isFull()) {
    		 throw new Exception("stak full");
    	 }
    	 idx++;
    	 arr[idx]=item;
     }
     public int size() {
			return idx+1;
		}
     public int peek() throws  Exception{
    	 if(isEmpty()) {
    		 throw new Exception("stak empty");
    	 }
			return arr[idx];
		}
     public int pop() throws  Exception{
    	 if(isEmpty()) {
    		 throw new Exception("stak empty");
    	 }
    	 int rv=arr[idx];
    	 idx--;
    	 return rv;
     }
     public void Display() {
    	 for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i]+" ");
		}
    	 System.out.println();
     }
}


