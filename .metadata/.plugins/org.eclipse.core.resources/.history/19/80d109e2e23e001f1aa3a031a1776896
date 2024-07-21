package Lec11;

import java.util.Scanner;
public class Permutation {
   public static void nextPermutation(int[] arr) {
       int i = arr.length - 2;//
       while (i >= 0 && arr[i] >= arr[i + 1]) {
           i--;
       }
      // System.out.print(i + " ");
       if (i >= 0) {
           int j = arr.length - 1;
           while (arr[j] <= arr[i]) {
               j--;
           }
          // System.out.print(j + " ");
           swap(arr, i, j);
       }
       reverse(arr, i + 1);
   }
   public static void swap(int[] arr, int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
   public static void reverse(int[] arr, int start) {
       int i = start, j = arr.length - 1;
       while (i < j) {
           swap(arr, i, j);
           i++;
           j--;
       }
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int t = scanner.nextInt();
       for (int i = 0; i < t; i++) {
           int n = scanner.nextInt();
           int[] arr = new int[n];
           for (int j = 0; j < n; j++) {
               arr[j] = scanner.nextInt();
           }
           nextPermutation(arr);
           for (int j = 0; j < n; j++) {
               System.out.print(arr[j] + " ");
           }
           System.out.println();
       }
   }
}