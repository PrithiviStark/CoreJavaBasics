package com.qspiders.classString;

public class Program4 
{
	public static void main(String[] args) 
	{
		StringBuffer buffer=new StringBuffer("Qspiders");
		StringBuilder builder=new StringBuilder("Qspiders");
		System.out.println(buffer);
		System.out.println(builder);
		buffer.append(" Velachery");
		builder.append(" Vadapalani");
		System.out.println(buffer);
		System.out.println(builder);
	}
}