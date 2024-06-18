package com.qspiders.classString;

public class Program2 {
	public static void main(String[] args) {
		String s1="Java";
		System.out.println(s1.toString());
		
		String s2="a";
		System.out.println(s2.hashCode());
		
		String s3="Sql";
		String s4=new String("Sql");
		System.out.println(s3.equals(s4));
	}
}
