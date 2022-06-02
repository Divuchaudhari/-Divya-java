package com.capgemini.demo.col;

import java.util.HashMap;

public class MapDemo {
public static void main(String[] args) {
		
		/*HashMap<Integer, String> hm = new HashMap<>();
		//HashMap(key,value);
		hm.put(1, "One");
		hm.put(2, "Two");
		System.out.println(hm);
		System.out.println("=====================================");
		
		
		HashMap<String, String> stateCode = new HashMap<>();
		stateCode.put("MH", "Maharashtra");
		stateCode.put("TS", "Telangana");
		stateCode.put("KA", "Karnataka");
		System.out.println(stateCode);
		System.out.println(stateCode.get("TS"));  //get()
		System.out.println(stateCode.keySet());
		System.out.println(stateCode.values());
		
		
		System.out.println("=======================================");*/
		
		HashMap<Integer, String> stateCode1 = new HashMap<>();
		stateCode1.put(1, "Maharashtra");
		System.out.println(stateCode1.get(1));
		
		System.out.println(stateCode1);
		
	}

}
