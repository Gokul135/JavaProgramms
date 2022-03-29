package fileReadingExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location="UsingFileWriter.txt";
		
		FileReader fileread=new FileReader(Location);
		
		BufferedReader bufferdreader=new BufferedReader(fileread);
		
String Currentline;

		while( (Currentline= bufferdreader.readLine())!=null) {
		
		System.out.println(Currentline);}
		
	}

}
