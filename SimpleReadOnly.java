import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleReadOnly {

	public static void main(String[] args) throws IOException {
	
		FileInputStream inputStream = new FileInputStream(new File(args[0]));
	
		int fileByte;
	
		long startTime = System.currentTimeMillis();
	
		while ((fileByte = inputStream.read()) != -1);
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = (endTime - startTime);
		
		System.out.println(totalTime);
		
		inputStream.close();
		
	}

}
