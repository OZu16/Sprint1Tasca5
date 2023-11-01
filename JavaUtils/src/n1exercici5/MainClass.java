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
		
		
		String directory = new File("").getAbsolutePath();
		File directoryContent = new File(directory);
		String txt = new File(".\\src\\directory.txt").getAbsolutePath();
		
		
		try {
		FileWriter writer = new FileWriter(txt);
		DirectoryTreeTxt directoryTree = new DirectoryTreeTxt(directoryContent, 0, writer, txt);
		directoryTree.directoryTxtWriter();
		System.out.println("abre directori afegit a 'directori.txt'\n");
		directoryTree.directoryTxtReader();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			SerializablePerson person1 = new SerializablePerson("Paco", "Pepe", 50, "21782368Z");
			String path = new File(".\\src\\person.ser").getAbsolutePath();
			ObjectOutputStream writeFileSer = new ObjectOutputStream(new FileOutputStream(path));
			writeFileSer.writeObject(person1);
			writeFileSer.close();
			
			ObjectInputStream readFileSer = new ObjectInputStream(new FileInputStream(path));
			SerializablePerson person1Ser = (SerializablePerson)readFileSer.readObject();
			readFileSer.close();
			
			
			System.out.println("\n " + person1Ser.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}

}