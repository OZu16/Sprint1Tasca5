package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		String directory = "C:\\";
		
		sortDirectory(directory);

	}
	
	
	public static void sortDirectory(String directory) {
			
		
			
			File directoryContent = new File("C:\\");
			File[] files = directoryContent.listFiles();
			
			Arrays.sort(files);
			
			for (File file : files) {
                System.out.println(file.getName());
			}
		
	}
}
	
