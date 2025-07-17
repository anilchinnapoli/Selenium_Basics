package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingScreenShotByWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
	    //Identify the Element
		WebElement ele =	driver.findElement(By.xpath("//a[text()='Become a Seller']"));
		
	   	//Take The SS and Store it in temp file
		File src  = ele.getScreenshotAs(OutputType.FILE);
		
		//Create a new Empty File
		File f = new File("./WebElement/Become.png");
		
		//Copy the SS
		FileUtils.copyFile(src, f);
		
		//CLOSE THE BROWSER
		driver.quit();
		
	

	}

}
