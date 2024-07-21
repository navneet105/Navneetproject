package Lec15rec;

public class First_Occr {

	public static void main(String[] args) {
		// 
		int arr[]= {2,3,4,5,6,4,5,4,5,4};
		int item=4;
		System.out.println(Index(arr,item,0));

	}
	// tell recurion head recursion
	//if last statment is recursive call tell recusrion(recusrion kaam kre main kuch bhi na kru apne end se)bapes aate time kuch bhi nhi kr rh
	public static int Index(int arr[],int item, int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return Index(arr,item,i+1);
		
		
	}

}
