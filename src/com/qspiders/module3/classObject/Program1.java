package com.qspiders.classObject;

import java.util.Scanner;

class Demo
{
	
}
class Sample extends Demo
{
	
}
public class Program1 
{
	public static void main(String[] args) {
		Object o1=new Demo();
		Object o2=new Sample();
		Object o3=new Scanner(System.in);
		Object o4=new Object();
		System.out.println(o1.getClass());
		System.out.println(o2.getClass());
		System.out.println(o3.getClass());
		System.out.println(o4.getClass());
	}
}
