package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingBacktoPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Convert Physical file to Java Object
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		//Create the object of Properties
		Properties p =new Properties();
		
		//Load properties object
		p.load(fis);
		
		//add new data
		p.put("Animal", "Lion");
		
		//Remove new data Removing the Old data
		p.remove("Cars", "Lamborgini");
		
		//Convert properties object to physical file and save the file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonData.properties");
		
		p.store(fos, "Updated");
		
		
				

	}

}
