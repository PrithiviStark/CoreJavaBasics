package com.qspiders.fileHandling;

import java.io.File;
import java.io.IOException;
public class Program2 
{
	public static void main(String[] args) 
	{
		File ref=new File("D:/3CCW3/FILEIO/Demo.txt");
		boolean bool=ref.exists();
		if(bool==false)
		{
			try
			{
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Exists");
		}
	}
}