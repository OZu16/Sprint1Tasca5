package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class Directory {
	
	private String directory = "";

	public Directory(String directory) {
		this.directory = directory;
	}
	
	public void sortDirectory() {
		
		try {
		File directoryContentFile = new File(this.directory);
		File[] files = directoryContentFile.listFiles();
		
		Arrays.sort(files);
		
		for (File file : files) {
            System.out.println(file.getName());
		}
		}catch(NullPointerException  e){
			e.printStackTrace();
		}
	
}

}
