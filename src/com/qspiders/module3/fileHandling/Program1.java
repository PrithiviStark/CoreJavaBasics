package com.qspiders.fileHandling;

import java.io.File;

public class Program1 
{
	public static void main(String[] args) 
	{
		File ref=new File("D:/3CCW3/FILEIO");
		boolean bool=ref.exists();
		if(bool==false)
		{
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else
		{
			System.out.println("Folder Exists");
		}
	}
}
