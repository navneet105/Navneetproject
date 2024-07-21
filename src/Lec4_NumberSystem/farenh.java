package Lec4_NumberSystem;

import java.util.Scanner;

public class farenh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int min_f = scanner.nextInt();
        int max_f = scanner.nextInt();
        int step = scanner.nextInt();

        for (int fahrenheit = min_f; fahrenheit <= max_f; fahrenheit += step) {
            int celsius = (int) Math.round((5 * (fahrenheit - 32)) / 9);
          
            System.out.println(fahrenheit+"\t"+celsius);
            
        }
    }

    

}
