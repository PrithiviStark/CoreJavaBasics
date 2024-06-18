package com.qspiders.fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Program7 {
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:/3CCW3/FILEIO/Repository.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Circle c=(Circle)ois.readObject();
		System.out.println(c.color);
		System.out.println(c.radius);
		ois.close();
		fis.close();
	}
}
