package Lec19Back;

public class Coin_combinatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin= {1,3,2};
		int amount =5;
		Combination(coin,amount,"",0);
		//infinte supply

	}
	public static void Combination(int [] coin,int amount,String ans,int idx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if(amount>=coin[i]) {
				amount-=coin[i];
				Combination(coin,amount,ans+coin[i],i);
				//Permutation(coin,amount-coin[i],ans+coin[i]);
				amount+=coin[i];
			}
		}
	}

}
