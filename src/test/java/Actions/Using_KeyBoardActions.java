package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to aplm
		driver.get("https://www.flipkart.com/");
		
		//Identify SearchTextfield
		WebElement searchbar  =driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		//Mouse Hover to Search bar 
	    act.moveToElement(searchbar).click(searchbar);
		
		act.keyDown(Keys.SHIFT).sendKeys("party").keyUp(Keys.SHIFT).build().perform();

		Thread.sleep(3000);
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
