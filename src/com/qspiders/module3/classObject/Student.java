package com.qspiders.classObject;

public class Student 
{
	int id;
	String name;
	double cgpa;
	void study()
	{
		System.out.println("Getting Job");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s1=new Student();
		s1.id=101;
		s1.name="Joy";
		s1.cgpa=6.8;
		
		Student s2=(Student)s1.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.cgpa);
	}
}
