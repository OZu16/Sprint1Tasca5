package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class Directory {
	
	private String directory = "";

	public Directory(String directory) {
		super();
		this.directory = directory;
	}
	
	public void sortDirectory() {
		
		try {
		File directoryContent = new File(this.directory);
		File[] files = directoryContent.listFiles();
		
		Arrays.sort(files);
		
		for (File file : files) {
            System.out.println(file.getName());
		}
		}catch(NullPointerException  e){
			e.printStackTrace();
		}
	
}

}
