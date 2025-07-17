package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//LAunch the Browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the webpage
		driver.manage().window().maximize();
		
		//Navigate to the Appln
		driver.get("https://www.facebook.com/");
		
		//Identify UN TF and Pass the Text
		driver.findElement(By.name("email")).sendKeys("VikassBhaii");
		
		//Identify pswd TF and Pass the text
		driver.findElement(By.name("pass")).sendKeys("NagurrSher00");
		
		//Click On Login
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(30000);
		
		//Close the browser
		driver.quit();
		

	}

}
