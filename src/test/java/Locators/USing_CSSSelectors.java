package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_CSSSelectors {

	public static void main(String[] args) throws InterruptedException {
		
		//LAunch the browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the webpage
		driver.manage().window().maximize();
		
		//Navigate to the appln
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify the Search button and pass the text
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Electronics");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}

}
