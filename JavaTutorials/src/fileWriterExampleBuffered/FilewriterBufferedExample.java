package fileWriterExampleBuffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterBufferedExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location="UsingBufferedWriter.txt";
		
		String Content="File Write Using Buffered method";
		
		FileWriter filewriter=new FileWriter(Location);
		
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		
		bufferedwriter.write(Content);
		bufferedwriter.close();
		
		
		
		
		
		
		
		
		
	}

}
