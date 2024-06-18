package com.qspiders.cframes;

import java.util.Iterator;
import java.util.LinkedList;

public class Program3 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Bike b=new Bike();
		ll.add(e);
		ll.add("Qspiders");
		ll.add(a);
		ll.add(s);
		ll.add(null);
		ll.add(m);
		ll.add(12345);
		ll.add(e);
		ll.add(b);
		ll.add(null);
		for(Object o:ll)
		{
			System.out.println(o);
		}
	}
}
