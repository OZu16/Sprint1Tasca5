package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		String directory = new File("").getAbsolutePath();
		File directoryContent = new File(directory);
		
		String txt = new File(".\\src\\directory.txt").getAbsolutePath();
		DirectoryTreeTxt directoryTree = new DirectoryTreeTxt();
		
		try {
		FileWriter writer = new FileWriter(txt);
		
		directoryTree.directoryTxtWriter(directoryContent, 0, writer);
		System.out.println("abre directori afegit a 'directori.txt'\n");
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}