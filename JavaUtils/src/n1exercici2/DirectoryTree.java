package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryTree {
	


	public static void sortDirectory(File a, int j) {
		
		try {
			
			
	
		File[] files = a.listFiles();
		
		Arrays.sort(files);
		
		for (File file : files) {
			String directoryOrFile = (file.isDirectory()) ? "D" : "F";
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified());
			StringBuilder indentation = new StringBuilder();
			for (int i = 0; i < j; i++) {
					indentation.append("  ");
	        }
            System.out.println(indentation.toString() + directoryOrFile + "  " + file.getName() + " (" + lastModifiedDate + ")");
         
            if (file.isDirectory()) {
                sortDirectory(file, j + 1);
            }
          
		}
		}catch(NullPointerException  e){
			e.printStackTrace();
		}
	
}

}