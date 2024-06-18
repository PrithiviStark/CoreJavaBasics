package com.qspiders.cframes;

import java.util.HashMap;

public class CountOccurrence2 
{
	public static void main(String[] args) 
	{
		String str="In India In arrennai In Velaarrery we have Velaarrery Qspiders";
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		String[] arr=str.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			if(hm.containsKey(arr[i]))
			{
				int count=hm.get(arr[i]);
				hm.put(arr[i], count+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
	}
}
