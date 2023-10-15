package n1exercici5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		/*directoryTree.directoryTxtWriter();
		System.out.println("abre directori afegit a 'directori.txt'\n");
		directoryTree.directoryTxtReader();*/
			
			try {
				ObjectOutputStream writeFileSer = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Gerard\\Desktop\\countries\\directoriotree.ser"));
				writeFileSer.writeObject(directoryTree);
				writeFileSer.close();
				
				ObjectInputStream readFileSer = new ObjectInputStream(new FileInputStream("C:\\Users\\Gerard\\Desktop\\countries\\directoriotree.ser"));
				DirectoryTreeTxt directoryTreeSer = (DirectoryTreeTxt)readFileSer.readObject();
				readFileSer.close();
				
				directoryTreeSer.directoryTxtWriter();
				System.out.println("abre directori afegit a 'directori.txt'\n");
				directoryTreeSer.directoryTxtReader();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	
	}

}