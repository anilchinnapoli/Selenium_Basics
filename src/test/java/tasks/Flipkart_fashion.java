package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_fashion {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicity Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an appln
		driver.get("https://www.flipkart.com/");
		
		//Perform Mouse Hover of an element 
		WebElement ele=driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Men's Top Wear")).click();
		
		WebElement DD =driver.findElement(By.xpath("//div[@class='suthUA']"));
		
		//WebElement ref=act.moveToElement(ref).perform();
		
		 Select s=new Select(DD);
		
		driver.findElement(By.xpath("//option[@value='700']")).click();
		
		driver.findElement(By.xpath("//option[text()='₹1000+']")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='zg-M3Z'][3]")).click();
		 
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath
				 ("//a[text()='Pack of 3 Men Embroidered Polo Neck Cotton Blend Multic...']")).click();
		
		Thread.sleep(3000);
		 //Fetch the Price
	    WebElement price =driver.findElement(By.xpath("//div[@class='hl05eU']"));
	    
	    System.out.println("The price is: "+price.getText());
		
			
		
		

	}

}
