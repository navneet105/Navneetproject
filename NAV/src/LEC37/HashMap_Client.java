package LEC37;

import java.util.HashMap;

public class HashMap_Client {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		
		map.put("Raj",87);
		map.put("raj",58);
		map.put("Ankita",78);
		map.put("Ankit",87);
		map.put("Kaju",79);
		map.put("Amisha", 77);
		map.put("Manoj", 68);
		map.put("Puneet", 57);
		map.put("Kaju",179);
		map.put(null, 6);
		System.out.println(map.containsKey("raj"));
		System.out.println(map.get("Kaju"));
		System.out.println(map);
	}

}
