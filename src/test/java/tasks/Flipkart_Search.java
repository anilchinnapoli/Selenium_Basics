package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Search {

	public static void main(String[] args) throws InterruptedException {
		
		//LAunch The Browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the WebPage
		driver.manage().window().maximize();
		
		//Navigate To the Appln
		driver.get("https://www.flipkart.com/");
		
		//Identigy the Search TextField and text data
		driver.findElement(By.className("Pke_EE")).sendKeys("Mobiles");
		driver.findElement(By.className("_2iLD__")).click();
		
		driver.findElement(By.className("XPD6hh")).sendKeys("Redmi");
		
		driver.findElement(By.className("_6i1qKy")).click();
		
		Thread.sleep(5000);
		
	}

}
