package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_XpathByText {
       public static void main(String[] args) throws InterruptedException {
		
    	   //LAunch the browser
    	   WebDriver driver = new ChromeDriver();
    	   
    	   //Maximize the WebPage
    	   driver.manage().window().maximize();
    	   
    	   //Navigate to the Appln
    	   driver.get("https://www.flipkart.com/");
    	   
    	   //Identify the Seach TF and Pas the Text
    	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles"+Keys.ENTER);
    	   
    	   Thread.sleep(3000);
    	   
    	   //Identify popularity 
    	   driver.findElement(By.xpath("//div[text()='Popularity']")).click();
    	   
    	   Thread.sleep(3000);
    	   
    	   driver.findElement(By.xpath("//div[text()='vivo T4x 5G (Pronto Purple, 128 GB)']")).click();
    	   
    	  // driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
    	   
    	   Thread.sleep(3000);
	}
}
