package com.qspiders.fileHandling;

import java.io.File;

public class Program3 {
	public static void main(String[] args) {
		File ref=new File("D:/3CCW3/FILEIO");
		boolean bool=ref.exists();
		if(bool==true)
		{
			ref.delete();
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("Not Exists");
		}
	}
}
