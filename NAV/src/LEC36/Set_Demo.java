package LEC36;

import java.util.*;

public class Set_Demo {
//solid principle desifn pattern 
	public static void main(String[] args) {
		//set main duplicate nhi leta ye sirf unique value deta h
		//duplicte add hi nhi hota 
		HashSet<Integer>set=new HashSet<>();
   //add o(1)  internally hash map use hota h
		set.add(2);
		set.add(2);
		set.add(12);
		set.add(-2);
		set.add(21);
		set.add(3);
		set.add(13);
		set.add(41);
		System.out.println(set);
		//get ? isme indexing nhi hota 
		// get-->cantains
//		System.out.println(set.contains(5));
//		System.out.println(set.contains(2));
//		//rempove 
//		System.out.println(set.remove(7));
//		System.out.println(set.remove(3));
//		System.out.println(set);
		TreeSet<Integer>set1=new TreeSet<>();
		//sorted data 
		//add log(n
		set1.add(2);
		set1.add(21);
		set1.add(-2);
		set1.add(21);
		set1.add(3);
		set1.add(13);
		set1.add(41);	
		set1.add(2);
		System.out.println(set1);
		LinkedHashSet<Integer>set2=new LinkedHashSet<>();
		//jis order m dat h usi order m 
		//add o(1)
		set2.add(2);
		set2.add(21);
		set2.add(-2);
		set2.add(21);
		set2.add(3);
		set2.add(13);
		set2.add(41);	
		set2.add(2);
		System.out.println(set2);
		for(int v:set) {
			System.out.print(v+" ");
		}
		System.out.println();
for(int v:set1) {
	System.out.print(v+" ");
		}
System.out.println();
for(int v:set2) {
	System.out.print(v+" ");
}
	}

}