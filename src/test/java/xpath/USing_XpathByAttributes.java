package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_XpathByAttributes {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the webpage
		driver.manage().window().maximize();
		
		//Navigate  to the appln
		driver.get("https://www.flipkart.com/");
		
		//Identify Search TF and Pass the text
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='XPD6hh']")).sendKeys("Apple");
		driver.findElement(By.xpath("//div[text()='Apple']")).click();
		
		//close the browser
		//driver.quit();
	}

}
