package com.qspiders.cframes;

import java.util.Arrays;
import java.util.TreeSet;

public class ProgramSortingWithTreeSet 
{
	public static void main(String[] args) {
		String input1="Hitler Woman";
		String input2="Mother In Law";
		input1=eliminateSpace(input1);
		input2=eliminateSpace(input2);
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		char[] ch1=input1.toCharArray();
		char[] ch2=input2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean status=true;
		if(ch1.length==ch2.length)
		{
			for (int i = 0; i < ch2.length; i++) {
				if((ch1[i]==ch2[i])==false)
				{
					System.out.println("Not Anagrams");
					status=false;
					break;
				}
			}
		}
		if(status==true)
			System.out.println("Anagrams");
	}
	static String eliminateSpace(String str) {
		char[] ch=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
				str=str+ch[i];
		}
		return str;
	}
}
