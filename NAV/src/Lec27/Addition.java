package Lec27;

public class Addition {

	public static void main(String[] args) {
		//method overloading check at complie time   sme parameter same arugent same datatype
		//overloading same class m hota h change parmeter and type of paramert aur sab same hota h.
		//variable number of argumnet  ...a
		//System.out.println(add(2,8));
		System.out.println(add(2,8,7));
		System.out.println(add(2,8.6,7));
		System.out.println(add(2,3,2,3,1,1,1,1,13,4,4));
	}
	public static void add(int a,int b) {
		int c= a+b;
	}
	public static int add(int a,long b) {
		return (int)(a+b);
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int add(int a,double b,int c) {
		return (int)(a+b+c);
	}
	public static int add(int y,int...a) {//   int...a correct//int a,int b,int...c correct//int...a,int y wrong
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
