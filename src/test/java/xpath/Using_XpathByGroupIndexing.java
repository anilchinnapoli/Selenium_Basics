package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByGroupIndexing {
   public static void main(String[] args) throws InterruptedException {
	
	   //Launch the WebBrowser
	   WebDriver driver = new ChromeDriver();
	   
	   //maximize the WebPage
	   driver.manage().window().maximize();
	   
	   //Navigate to the Appln
	   driver.get("https://www.netflix.com/in/Login");
	   
	   Thread.sleep(3000);
	   
	   //Identify Name TF
	   driver.findElement(By.xpath("(//input)[1]")).sendKeys("Anilchinna");
	   
	   //Identify Passwoed TF
       driver.findElement(By.xpath("(//input)[2]")).sendKeys("SKYlab bHAi");
       
       Thread.sleep(2000);
       
       //Click on the login page
       driver.findElement(By.xpath("(//button)[1]")).click();
	   
       //close the browser
       driver.quit();
	   
}
}
