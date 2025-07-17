package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//MAximixe the WebPage
		driver.manage().window().maximize();
		
		//Navigate to the appln
		driver.get("https://www.facebook.com/");
		
		//Identify the Link on WebPage And Click on it
		driver.findElement(By.linkText("Forgotten password?")).click();
  
		Thread.sleep(3000);
		//Close the WebPage
		driver.quit();
	}

}
