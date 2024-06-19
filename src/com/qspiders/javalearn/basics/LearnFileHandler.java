package javalearn.basics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LearnFileHandler {

	public static void main(String[] args) throws IOException {
		String filePath = "D:/FileHandlerTest/Prithivi/";
		String fileName="test.txt";
		File newFilePath = new File(filePath);
		File newFile =new File(filePath+fileName);
		
		boolean tstPath = newFilePath.exists();
		System.out.println("tstPath = "+tstPath);
		if(tstPath==false) {
			newFilePath.mkdirs();
			System.out.println("File created");
			
		}
		else {
			System.out.println("File already exist");
			
		}
		
		boolean tstFile = newFile.exists();
		System.out.println("tstFile = "+tstFile);
		if(tstFile==false) {
			newFile.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("file already exist");
		}
		try {
			FileWriter wr = new FileWriter(filePath+fileName);

			System.out.println("Writer----->");
			wr.write("avengers".toCharArray());
			wr.write("\n"+filePath+" is path is created for testing purpose on java program");
			wr.write(" by prithivi");
			wr.flush();
			wr.close();
		} 
		catch (IOException e) {
			System.out.println("Internal error");
			e.printStackTrace();
		} 
		
		FileReader rd = new FileReader(filePath+fileName);

		System.out.println("Reader----->");
		int value = rd.read();
		while(value!=-1) {
			System.out.print((char)value);
			value=rd.read();
		}
		rd.close();
		
	}

}
