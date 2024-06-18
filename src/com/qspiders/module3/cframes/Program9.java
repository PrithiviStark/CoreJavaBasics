package com.qspiders.cframes;

import java.util.LinkedHashMap;
import java.util.Set;

public class Program9 {
	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("TamilNadu", "Chennai");
		hm.put("Karnataka", "Mysore");
		hm.put("Karnataka", "Bangalore");
		hm.put("Kerala","Thiruvananthapuram");
		hm.put("Haryana", "Chandigarh");
		hm.put("Punjab", "Chandigarh");
		hm.put(101, 78.69);
		hm.put(null, "Delhi");
		hm.put(null, "New Delhi");
		hm.put("Pondicherry", null);
		hm.put("Ladakh", null);
		Set s=hm.entrySet();
		
		for(Object o:s)
		{
			System.out.println(o);
		}
	}
}
