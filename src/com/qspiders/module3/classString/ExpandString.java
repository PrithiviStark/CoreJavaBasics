package com.qspiders.classString;

public class ExpandString {
	public static void main(String[] args) {
		String str="a1b2c3d2";
		char[] ch=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i=i+2) 
		{
			char c1=ch[i];
			char c2=ch[i+1];
			for(char j='0';j<c2;j++)
			{
				str=str+c1;
			}
		}
		System.out.println(str);
	}
}
