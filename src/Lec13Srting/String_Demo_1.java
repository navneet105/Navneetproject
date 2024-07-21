package Lec13Srting;

public class String_Demo_1 {

	public static void main(String[] args) {
		// it is a class in java   claass means non primitive creation inn heap memory
		//without new valo ko location string pool ya intern pool me hota h(pool are present in spacial area in heap) in the pool duplicate are not allowed 
		String s1="Hello";//ip so(heap m spacial area known as pool )
		String s2="Hello";
		String s3=new String("Hello");//iska loaction heap m not in pool in this there may duplicate presnent
		String s4=new String ("Hello");//same as up
		//sting class n to_string ke method ko override due to which content is printing not the address .
		//nonprimitive m hemaasa == address compare krta h and in primitive == content compare krta h
		System.out.println(s1);
		System.out.println(s3);

	}

}
