package com.qspiders.cframes;

import java.util.Set;
import java.util.TreeMap;

public class Program10 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("Valimai", "Ajith");
		tm.put("Master", "Vijay");
		tm.put("Beast", "Vijay");
		tm.put("ET", "Surya");
		tm.put("Maran", "Dhanush");
		tm.put("Mahan", "Vikram");
		tm.put("Annathe", "Rajinikanth");
		tm.put("Kamal", "Elections");
		tm.put("Kamal", "Bigg Boss");
		tm.put("Aram",456);
		tm.put("Velachery",null);
		
		Set s=tm.entrySet();
		for(Object o:s)
		{
			System.out.println(o);
		}
	}
}
