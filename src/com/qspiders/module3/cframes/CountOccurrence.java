package com.qspiders.cframes;

import java.util.HashMap;

public class CountOccurrence 
{
	public static void main(String[] args) {
		String str="Qspiders";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(hm.containsKey(ch[i]))
			{
				int count=hm.get(ch[i]);
				hm.put(ch[i], count+1);
			}
			else
			{
				hm.put(ch[i], 1);
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(hm.containsKey(ch[i]))
			{
				int count=hm.get(ch[i]);
				if(count>1)
					System.out.println(ch[i]);
			}
		}
	}
}
