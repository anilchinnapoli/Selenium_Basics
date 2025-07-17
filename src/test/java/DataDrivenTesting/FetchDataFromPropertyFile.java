package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	
		 // Step 01 Converting physical properties File to java obj
		 FileInputStream fis =new FileInputStream
				 ("./src/test/resources/CommonData.properties");
		 
		 //Step 02 Create an obj of Properties
		 Properties p =new Properties();
		 
		 //Step 03 Load the prop obj
		 p.load(fis);
		 
		 
		 //Step 04 Fetch the data
		 String data = p.getProperty("Browser");
		 String data0 = p.getProperty("URL");
		 String data1 = p.getProperty("Username");
		 String data2 = p.getProperty("Password");
		 String data3 = p.getProperty("timeouts");
		 
		 System.out.println(data);
		 System.out.println(data0);
		 System.out.println(data1);
		 System.out.println(data2);
		 System.out.println(data3);
		 
	}

}
