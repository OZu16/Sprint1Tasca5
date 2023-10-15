package n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		String directory1 = "C:\\Amazon Games\\Library\\aaaa";
		File directoryContent1 = new File(directory1);
		String directory2 = "C:\\Amazon Games\\Library\\Blasphemous";
		File directoryContent2 = new File(directory2);
		
		DirectoryTree directoryTree1 = new DirectoryTree();
		DirectoryTree directoryTree2 = new DirectoryTree();
		
		directoryTree1.sortDirectory(directoryContent1, 0);
		directoryTree2.sortDirectory(directoryContent2, 0);

	}

}