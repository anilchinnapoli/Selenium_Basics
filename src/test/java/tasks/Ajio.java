package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio {

	public static void main(String[] args) {
		
		//Launch the appln
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://www.ajio.com/");
		
		WebElement ref=driver.findElement
				(By.xpath("//span[text()='Home & Kitchen']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ref).perform();
		
		driver.findElement(By.xpath("//a[text()='Bakeware']")).click();
		
		
		
	}

}
