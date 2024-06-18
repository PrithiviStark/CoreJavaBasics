package com.qspiders.cframes;

import java.util.Iterator;
import java.util.TreeSet;

public class Program7 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Chennai");
		ts.add("Mumbai");
		ts.add("Hyderabad");
		ts.add("Bangalore");
		ts.add("Kolkatta");
		ts.add("Delhi");
		ts.add("Panaji");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
