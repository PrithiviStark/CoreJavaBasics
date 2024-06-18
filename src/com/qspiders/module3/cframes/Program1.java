package com.qspiders.cframes;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Bike b=new Bike();
		al.add(s);
		al.add(e);
		al.add("Qspiders");
		al.add("Qspiders");
		al.add(a);
		al.add(m);
		al.add(null);
		al.add(b);
		al.add(null);
		for(Object o:al)
		{
			System.out.println(o);
		}
	}
}
