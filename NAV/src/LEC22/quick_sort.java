package LEC22;

public class quick_sort {
//recurrence realation
	public static void main(String[] args) {
		int arr[]= {5,7,2,1,8,3,4};

	}
	public static void Sort(int[]arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int idex=Partition(arr,si,ei);
		Sort(arr,si,idex-1);
		Sort(arr,idex+1,ei);
	}
	public static int Partition(int[] arr, int si, int ei) {
		int item=arr[ei];
		int idx=si;
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				int temp=arr[idx];
				arr[idx]=arr[i];
				arr[i]=temp;
				idx++;
			}
		}
		int temp=arr[idx];
		arr[idx]=arr[ei];
		arr[ei]=temp;
		return idx;
	}

}
