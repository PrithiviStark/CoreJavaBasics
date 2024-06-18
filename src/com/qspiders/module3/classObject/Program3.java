package com.qspiders.classObject;
class Student1
{
	
}
class Student2
{
	@Override
	public int hashCode() 
	{
		return 105;
	}
}
public class Program3 
{
	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println(s1.hashCode());
		
		Student2 s2=new Student2();
		System.out.println(s2.hashCode());
	}
}
