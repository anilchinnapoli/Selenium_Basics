package tasks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Using_Flipkart {

	@Parameters("browser")
	@Test
	public void flipkart(String BROWSER) throws InterruptedException {
	
		 WebDriver driver =null;
		 if(BROWSER.equals("Chrome")) {
			 driver = new ChromeDriver();
		 }
		 else if(BROWSER.equals("Edge")) {
			 driver = new EdgeDriver();
		 }
		 else {
			 driver = new ChromeDriver();		 }
	 
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.flipkart.com/");
	  
	  Thread.sleep(2000);
	  
	  driver.quit();
	  Reporter.log("Flipkart opened Successfull",true);
		
	}
}
