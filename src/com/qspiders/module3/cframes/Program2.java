package com.qspiders.cframes;

import java.util.Iterator;
import java.util.Vector;

public class Program2 {
	public static void main(String[] args) {
		Vector v=new Vector();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Bike b=new Bike();
		v.add(e);
		v.add("Qspiders");
		v.add(a);
		v.add(s);
		v.add(null);
		v.add(m);
		v.add(12345);
		v.add(e);
		v.add(b);
		v.add(null);
		for(Object o:v)
		{
			System.out.println(o);
		}
	}
}
