package test;

import java.util.Random;

public class feb {

	public static void main(String[] args) {
		int s=10;
		int e=100;
		Random rn=new Random();
		for (int i = 0; i < 15; i++) {
			int v=rn.nextInt(e-s+1)+s;
			System.out.println(v);
			
		}
			
		}
}
