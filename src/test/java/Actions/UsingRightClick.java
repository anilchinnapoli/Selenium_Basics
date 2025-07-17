package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingRightClick {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//MAximize the Window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the appln
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		//Performing Right click
		WebElement rightclick =driver.findElement(By.xpath("//span[text()='right click me']"));
		 
		Actions act =new Actions(driver);
		
		act.contextClick(rightclick).perform();
		
		Thread.sleep(3000);
		
		//Refresh the WebPage
		driver.navigate().refresh();
		
		//Perfroming Double Click
		WebElement doubleclick = driver.findElement
			(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	
		act.doubleClick(doubleclick).perform();
	
		Thread.sleep(3000);
		
		driver.quit();
		
	
		
	}

}
