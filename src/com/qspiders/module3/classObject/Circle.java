package com.qspiders.classObject;

public class Circle implements Cloneable
{
	int radius=25;
	String borderColor="Black";
	String fillColor="Blue";
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Circle c=new Circle();
		
		Circle copy=(Circle)c.clone();
		System.out.println(copy.radius);
		System.out.println(copy.borderColor);
		System.out.println(copy.fillColor);
	}
}
