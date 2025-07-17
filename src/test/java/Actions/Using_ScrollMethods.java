package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_ScrollMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser 
		WebDriver driver =new EdgeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicity Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//NAvigate to the appln
		driver.get("https://www.amazon.in/");
		
		//Scroll the WebPage using coordinates
		Actions ac=new Actions(driver);
		 ac.scrollByAmount(0, 300).perform();
		 
		 Thread.sleep(3000);
		 
		WebElement act = driver.findElement(By.xpath("//h5[contains(text(),'Abe')]"));
		 ac.scrollToElement(act).perform();
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
	}
}
