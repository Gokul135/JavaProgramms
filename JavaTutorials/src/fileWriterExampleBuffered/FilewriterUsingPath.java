package fileWriterExampleBuffered;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilewriterUsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location="FileWrite Using Path.txt";
		String Content="File writer using Path";
		
		Path path=Paths.get(Location);
		Files.write(path, Content.getBytes());
				
		
		
		
		
		
		
		
		
	}

}
