package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IDLocator {

	public static void main(String[] args) throws InterruptedException {
	 
		//Launch The Browser
		WebDriver driver =new ChromeDriver();
		
		//MAximize the Webpage
		driver.manage().window().maximize();
		
		//Navigate to the Apln
		driver.get("https://www.facebook.com/");

		//Identify the UN TF and Pass the Text
		driver.findElement(By.id("email")).sendKeys("anil");
		
		//Identify the pswd TF And Pass the Text
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		//Identigy Login Button and Click on it
		//we should not consider alpha numeric values
		//driver.findElement(By.id("u_0_5_6V")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
	}

}
