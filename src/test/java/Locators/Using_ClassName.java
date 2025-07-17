package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch The Browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the webpage
		driver.manage().window().maximize();
		
		//Navigate to the Appln
		driver.get("https://www.facebook.com/");
		
        //Identify The UN TF and Pass The Text
		driver.findElement(By.className("_55r1")).sendKeys("Jesica");
		//Identify The pswd and pass the text
		driver.findElement(By.className("_9npi")).sendKeys("Jessi");
		//Identify The login Button and Click on
		driver.findElement(By.className("_42ft")).click();
        
		Thread.sleep(3000);
		
		//Close the webpage
		driver.quit();
		
	}

}
