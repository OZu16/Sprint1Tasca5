package n1exercici5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryTreeTxt implements Serializable {
	
	
	private File directoryContent;
	private int j;
	private transient FileWriter writer;
	private String txt;

	
	
	public DirectoryTreeTxt(File directoryContent, int j, FileWriter writer, String txt) {
		super();
		this.directoryContent = directoryContent;
		this.j = j;
		  try {
	            this.writer = new FileWriter("C:\\Users\\Gerard\\Desktop\\countries\\directori.txt");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		this.txt = txt;

	}
	

	public File getDirectoryContent() {
		return directoryContent;
	}


	public void setDirectoryContent(File directoryContent) {
		this.directoryContent = directoryContent;
	}


	public int getJ() {
		return j;
	}


	public void setJ(int j) {
		this.j = j;
	}


	public FileWriter getWriter() {
		return writer;
	}


	public void setWriter(FileWriter writer) {
		this.writer = writer;
	}


	public String getTxt() {
		return txt;
	}


	public void setTxt(String txt) {
		this.txt = txt;
	}
	



	public void directoryTxtWriter() throws IOException{
		
		try {
			
		File[] files = getDirectoryContent().listFiles();
		
		Arrays.sort(files);
		
		for (File file : files) {
			try {
			
			String directoryOrFile = (file.isDirectory()) ? "D" : "F";
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified());
			StringBuilder indentation = new StringBuilder();
			
			for (int i = 0; i < j; i++) {
					indentation.append("  ");
	        }
			
	    	getWriter().write(indentation.toString() + directoryOrFile + "  " + file.getName() + " (" + lastModifiedDate + ")\n");
	    	
			} catch (IOException e) {
		            e.printStackTrace();
		    }
			
            if (file.isDirectory()) {
            	setDirectoryContent(file);
            	setJ(getJ() + 1);
                directoryTxtWriter();
            }
            
		}
		
		}catch(NullPointerException  e){
			e.printStackTrace();
		}
		
	}
	
	public void directoryTxtReader() {
		
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