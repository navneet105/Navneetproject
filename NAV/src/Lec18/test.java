package Lec18;

import java.util.Scanner;

public class test {

static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String que = sc.next();
        Keypad(que, "");
    }
   public static void Keypad(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        char ch = que.charAt(0);
        String press = key[ch - '0'];
        for (int i = 0; i < press.length(); i++) {
            Keypad(que.substring(1), ans + press.charAt(i));
        }
    }

}
