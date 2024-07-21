package Lec122darray;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,3,4,5},
		         {1,8,7,3},
		         {10,11,13,12},
		         {18,14,19,20}};
		Transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	
                public static void Transpose(int arr[][]) {
                	for (int i=0;i<arr.length;i++) {
                		for(int j=i+1;j<arr[0].length;j++) {
                			int temp=arr[i][j];
                			arr[i][j]=arr[j][i];
                			arr[j][i]=temp;
                		}
                	}
	
     }
}
