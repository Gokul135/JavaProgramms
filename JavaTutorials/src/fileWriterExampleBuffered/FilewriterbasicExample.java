package fileWriterExampleBuffered;

import java.io.FileWriter;
import java.io.IOException;

public class FilewriterbasicExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		String Location="UsingFileWriter.txt";
		String Content="Must Know Java Consepts For Selenium Testers";
		
		FileWriter filewriter=new FileWriter(Location);
		filewriter.write(Content);
		filewriter.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
