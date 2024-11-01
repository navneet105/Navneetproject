package Lec13Srting;

import java.util.Scanner;

public class MAXDOT {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int maxLength = maxLengthBeforeDot(str);
        System.out.println(maxLength);
    }

    public static int maxLengthBeforeDot(String str) {
        int maxLength = 0;
        int currentIndex = 0;
        while (currentIndex < str.length()) {
            int dotIndex = str.indexOf('.', currentIndex);
            if (dotIndex != -1) {
                int length = dotIndex - currentIndex;
                if (length > maxLength) {
                    maxLength = length;
                }
                currentIndex = dotIndex + 1;
            } else {
                break;
            }
        }
        return maxLength;
    }

}
