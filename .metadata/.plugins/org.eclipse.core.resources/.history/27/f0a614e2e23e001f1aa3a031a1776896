package Lec122darray;

import java.util.Scanner;

public class wav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int arr[][]=new int[n][m];
	        for(int i=0;i<arr.length;i++ ){
	            for(int j=0;j<arr[0].length;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        spiral(arr,n,m);
	    }
	    public static void spiral(int arr[][],int n,int m){
	        int minc=0 ,minr=0;
	        int maxc=m-1,maxr=n-1;
	        int te=arr.length*arr[0].length;
	        int count=0;
	        while(count<te){
	            for(int i=minr;i<=maxr&&count<te;i++){
	                System.out.print(arr[i][minc]+", ");
	                count++;
	            }
	            minc++;
	            for(int i=minc;i<=maxc&&count<te ;i++){
	                System.out.print(arr[maxr][i]+", ");
	                 count++;
	            }
	            maxr--;
	            for(int i=maxr;i>=minr&&count<te;i--){
	                System.out.print(arr[i][maxc]+", ");
	                 count++;
	            }
	            maxc--;
	            for(int i=maxc;i>=minc&&count<te;i--){
	                System.out.print(arr[minr][i]+", ");
	                 count++;
	            }
	           minr++;

	        }
	         System.out.print("END");

	}

}
