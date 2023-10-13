package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		Directory directory1 = new Directory("C:\\Amazon Games\\Library\\Blasphemous");
		
		directory1.sortDirectory();
		
	}

}