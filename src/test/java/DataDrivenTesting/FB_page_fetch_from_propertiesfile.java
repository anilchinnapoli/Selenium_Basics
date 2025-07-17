package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_page_fetch_from_propertiesfile {

	public static void main(String[] args) throws IOException {
		
		//Convert Physical properties to java obj
		FileInputStream fis = new FileInputStream("./src/test/resources/Fbpage.properties");

		//Create Obj of Properties
		Properties pro = new Properties();
		
		//Load the properties Object
		pro.load(fis);
		
	    //Get url from properties file
		String url = pro.getProperty("Url");
		String un =  pro.getProperty("UserName");
		String pswd = pro.getProperty("Password");
		String timeouts =pro.getProperty("timeouts");
		
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the Browser
		driver.manage().window().maximize();
		
		//Convert the Timeouts into int value i.e string to Long
		Long time = Long.parseLong(timeouts);
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		//Navigate to appln
		driver.get(url);
		
		//Find Un textField and pass the text
		driver.findElement(By.name("email")).sendKeys(un);
		
		//Find pswd textfield and pass the text
		driver.findElement(By.id("pass")).sendKeys(pswd);
		
		//Click on login Button
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		driver.quit();
		
	}

}
