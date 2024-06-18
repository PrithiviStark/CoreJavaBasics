package com.qspiders.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args){
		FileWriter ref=null;
		try{
			ref=new FileWriter("D:/3CCW3/FILEIO/Demo.txt");
			ref.write("ABC");
			ref.write("\n");
			ref.write("abc");
			ref.flush();
			System.out.println("Write Completed");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally
		{
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}