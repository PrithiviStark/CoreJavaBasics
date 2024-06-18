package com.qspiders.basics;

public class LogialAndBItwiseOperator 
{
public static void main(String[] args) 
{
//logical operator thats two boolean as input and compare, after compare returns a boolean value
	int a=10;
	int b=20;
	System.out.println("output for logical operator");
	System.out.println(a>b&&b>a);
	System.out.println(a>b||b>a);
	System.out.println(!(a>b));
/*bitwise operators are working in binary form,
covert the input value from decimal to binary form and do logical in binary form,
return the value in decimal form */ 
	System.out.println("output for bitwise operator");
	System.out.println(a&b);
	System.out.println(a|b);
	System.out.println(a^b);
	System.out.println(a>>2);
	System.out.println(a<<2);
}
}
