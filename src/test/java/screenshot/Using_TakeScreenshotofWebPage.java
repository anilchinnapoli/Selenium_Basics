package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_TakeScreenshotofWebPage {



	public static void main(String[] args) throws InterruptedException, IOException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//NAvigate to the Appln
		driver.get("https://www.flipkart.com/");
		
	    Thread.sleep(3000);
	    
		//ScreenShot of WebPage
//		Step 1 : DownCast driver to TakeScreenShot
		TakesScreenshot ts =(TakesScreenshot)driver;
		
//		Step 2 : Take Screenshot and store it in temp file
		File src = ts.getScreenshotAs(OutputType.FILE);
		
//      Step 3 : Create a new Empty file
		File d = new File("./ScreenShots/Flipkart1.png");
		
//      Step 4 : Copy the ScreenShot FDrom temporary file to Permanent File
		
		//Using FileHandler
	   // org.openqa.selenium.io.FileHandler.copy(src, d);
	    
	    //Using FileUtils
	    FileUtils.copyFile(src, d);
	
	    //Close the Browser
	    driver.quit();
		
		
		
		

	}

}
