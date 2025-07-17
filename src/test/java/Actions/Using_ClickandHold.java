package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the Browser
        WebDriver driver = new ChromeDriver();
        		 ;
         
        //Maximize the Window
        driver.manage().window().maximize();
         
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //Navigate to appln
        driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
        
        //Perform The Click and Hold Operations
         WebElement click =driver.findElement(By.id("circle"));
         
         //Click and Hold the Element
         Actions act = new Actions(driver);
         
         act.clickAndHold(click).perform();
         
         Thread.sleep(3000);
         
         //Release the element
         act.release(click).perform();
         
         Thread.sleep(3000);
         
         //Close the Browser
         driver.quit();
         
        
         
	}

}
