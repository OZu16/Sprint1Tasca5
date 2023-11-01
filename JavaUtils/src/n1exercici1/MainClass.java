package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		String path = new File(".\\src\\").getAbsolutePath();
		
		Directory directory1 = new Directory(path);
		
		directory1.sortDirectory();
		
	}

}