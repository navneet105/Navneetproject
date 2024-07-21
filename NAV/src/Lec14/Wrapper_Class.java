package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		//kuch ase jagah h jha pe primitivr data allow nhi hoti h (8)Array list do not allow primitive data .primitive dta ke corresponding ek wrapper class hoti h
		//wrapper class is only for primitive data types
		int a=10;//stack mmemory
		Integer a1=10;//heap
		System.out.println(a);
		System.out.println(a1);
//		Long l=19L;
//		Byte b=19;
//		Character ch='a';
         int b=17;
         Integer b1=12;
         b1=b;//stack ko heap m dal diya 2k loction (Auto Boxing)
         System.out.println(b1);
         a=a1;//unboxing  heap ko stak m dal dena   (== main adreess compare m non primitive)
         System.out.println(a);
         //-128to 127 integaer cahche bn jata h tabhi true(duplicte nhi bnega  is range m) byte ,short ,int, long, char, m hota h
         Integer c1=19;
         Integer c2=19;
         Integer c3=195;
         Integer c4=195;
         System.out.println(c1==c2);
         System.out.println(c3==c4);
         
         
         

	}

}
