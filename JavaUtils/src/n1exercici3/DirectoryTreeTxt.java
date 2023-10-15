package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryTreeTxt {
	


	public void directoryTxtWriter(File directoryContent, int j, FileWriter writer) {
		
		try {
			
		File[] files = directoryContent.listFiles();
		
		Arrays.sort(files);
		
		for (File file : files) {
			try {
			String directoryOrFile = (file.isDirectory()) ? "D" : "F";
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified());
			StringBuilder indentation = new StringBuilder();
			for (int i = 0; i < j; i++) {
					indentation.append("  ");
	        }
			
	    	writer.write(indentation.toString() + directoryOrFile + "  " + file.getName() + " (" + lastModifiedDate + ")\n");
	    	
			} catch (IOException e) {
		            e.printStackTrace();
		    }
            if (file.isDirectory()) {
                directoryTxtWriter(file, j + 1, writer);
            }
            
		}
		
		}catch(NullPointerException  e){
			e.printStackTrace();
		}
		
	}
	
	public void directoryTxtReader(String txt) {
		
		 try {
             Scanner scanner = new Scanner(new File(txt));

             while (scanner.hasNextLine()) {
                 String linea = scanner.nextLine();
                 System.out.println(linea);
             }

             
         } catch (FileNotFoundException e) {
         	e.printStackTrace();
         }
		
	}

}