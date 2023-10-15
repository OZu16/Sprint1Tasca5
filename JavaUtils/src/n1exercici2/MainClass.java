package n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		String directory = "C:\\Amazon Games\\Library\\Blasphemous";
		
		File directoryContent = new File(directory);
		DirectoryTree directoryTree1 = new DirectoryTree();
		
		directoryTree1.sortDirectory(directoryContent, 0);
		
	}

}