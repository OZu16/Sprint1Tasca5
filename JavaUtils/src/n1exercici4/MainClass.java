package n1exercici4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		
		String directory = "C:\\Amazon Games\\Library\\Blasphemous";
		File directoryContent = new File(directory);
		String txt = "C:\\Users\\Gerard\\Desktop\\countries\\directori.txt";
		
		
		try {
		FileWriter writer = new FileWriter(txt);
		DirectoryTreeTxt directoryTree = new DirectoryTreeTxt(directoryContent, 0, writer, txt);
		directoryTree.directoryTxtWriter();
		System.out.println("abre directori afegit a 'directori.txt'\n");
		directoryTree.directoryTxtReader();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}