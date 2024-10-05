package LEC36;

import java.util.*;

public class TreeMap_Demo {

	public static void main(String[] args) {
		TreeMap<String,Integer>map=new TreeMap<>();
		//key unique h 
		//sare operation log(n)
		//key wise sorted aata h isme 
		map.put("Raj",87);
		map.put("raj",58);
		map.put("Ankita",78);
		map.put("Ankit",87);
		map.put("Kaju",79);
		map.put("Amisha", 77);
		map.put("Manoj", 68);
		map.put("Puneet", 57);
		map.put(null, 6);
		//map.put("Kaju",79);
		System.out.println(map);
	
		

	}

}
