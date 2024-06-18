package com.qspiders.cframes;

import java.util.HashSet;
import java.util.Iterator;

public class Program6 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Bike b=new Bike();
		hs.add(s);
		hs.add(e);
		hs.add("Qspiders");
		hs.add(143);
		hs.add("Qspiders");
		hs.add(a);
		hs.add(m);
		hs.add(null);
		hs.add(b);
		hs.add(null);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
