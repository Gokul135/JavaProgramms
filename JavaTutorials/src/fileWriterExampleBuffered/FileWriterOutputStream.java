package fileWriterExampleBuffered;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location="Using Fileouput Stram.txt";
		String Content="File Writer using FOS Stream";
		
		FileOutputStream FOSStream=new FileOutputStream(Location);
		
		
byte [ ]	Writethis=	Content.getBytes();

FOSStream.write(Writethis);

FOSStream.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
