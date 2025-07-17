package tasks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Using_Ajio {

	@Parameters("browser")
	@Test
	
	public void ajio(String BROWSER) throws InterruptedException {

		WebDriver driver = null;
		
		if(BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
			}
		
		else if(BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		}
		
		else {
			driver = new ChromeDriver();
		}
		
		//Maximize the Window
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Navigate  to appln
		driver.get("https://www.ajio.com/");

	
		Thread.sleep(2000);

		//Close the browser
		driver.quit();

		Reporter.log("Ajio opened Successfull", true);

	}
}
