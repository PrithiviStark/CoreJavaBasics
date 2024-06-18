package com.qspiders.Stringsmethods;

public class MethodsOfString
{
	public static void main(String[] args) 
	{
	String s="PrithiviRajan is a java Developer";
	System.out.println(s.length());                 //33
	System.out.println(s.charAt(0));				//P
	System.out.println(s.indexOf("R"));				//8
	System.out.println(s.lastIndexOf("j"));			//19
	System.out.println(s.contains("java"));			//true
	System.out.println(s.startsWith("Prithivi"));	//true
	System.out.println(s.endsWith("Developer"));	//true
	System.out.println(s.toUpperCase());			//PRITHIVIRAJAN IS A JAVA DEVELOPER
	System.out.println(s.toLowerCase());			//prithivirajan is a java developer
	System.out.println(s.trim());					//Prithivirajan is a java Developer
	System.out.println(s.substring(0,13));			//PrithiviRajan
	char[] ch=s.toCharArray();						//character array formation
	String[] str=s.split(" ");						//string array formation
	System.out.println(s.equals("PrithiviRajan is a java Developer"));//true
	System.out.println(s.equalsIgnoreCase("prithivirajan is a java developer"));//true
	}
}
