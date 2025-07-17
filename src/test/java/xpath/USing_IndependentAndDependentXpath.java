package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_IndependentAndDependentXpath {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate To the Browser
		driver.get("https://www.flipkart.com/");
		
		//Identify the Search Tf and Pass the TExt
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles"+Keys.ENTER);
		
		//
		//driver.findElement(By.xpath("//div[@class='KzDlHZ'][1]")).click();
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='VU-ZEz']/../../../div[@class='x+7QT1']/div[@class='UOCQB1']/div/div[@class='Nx9bqj CxhGGd']"));
		 System.out.println(ele.getText());
		Thread.sleep(3000);
	}

}
