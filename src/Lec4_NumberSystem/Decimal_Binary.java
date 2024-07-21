package Lec4_NumberSystem;

public class Decimal_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=37;
		int sum=0;
		int mul=1;
		
		while(n!=0) {
			int rem=n%2
					;
			sum=sum+rem*mul;
			mul=mul*10;
		n=n/2;
		}
          System.out.println(sum);
	}

}


//10 base 8 m jana j    multiblication o kaam souce  8    division destination  10

//src----des//  sorce aur destination main 10 hona chye (one of the base is 10)
//rem=n%dest;
//sum=sum+rem*mul;
//mul=mul*source;
//n/=n/des
//  if both are deffrent then 5,7   first go from 5 to 10 and 10 to 7  then it will be corrected