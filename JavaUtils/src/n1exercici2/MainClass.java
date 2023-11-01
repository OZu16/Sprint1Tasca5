package n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		

		
		String directory = new File("").getAbsolutePath();
		File directoryContent = new File(directory);
		
		
		DirectoryTree directoryTree = new DirectoryTree();
		directoryTree.sortDirectory(directoryContent, 0);


	}

}