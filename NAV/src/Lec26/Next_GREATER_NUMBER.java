package Lec26;

import java.util.Scanner;

public class Next_GREATER_NUMBER {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int j;
                for (j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        System.out.print(arr[i] + "," + arr[j] + " ");
                        break;
                    }
                }
                if (j == n) {
                    System.out.print(arr[i] + ",-1 ");
                }
            }
            System.out.println();}

	}

}
