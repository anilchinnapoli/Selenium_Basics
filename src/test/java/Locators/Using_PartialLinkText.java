package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Webpage
		driver.manage().window().maximize();
		
		//NAvigate to the appln
		driver.get("https://www.facebook.com/");
		
		//Identify the PartialLink Text and Click on it
		driver.findElement(By.partialLinkText("Forgotten")).click();
        
		Thread.sleep(5000);
		
		//Close The Browser
		driver.quit(); 
	}

}
