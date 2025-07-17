package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize the WEbPage
		driver.manage().window().maximize();
		
		//Navigate to the appln
		driver.get("https://www.amazon.in/");
		
		//Identify the Search TF and Pass the text
		driver.findElement(By.xpath("//input[contains(@aria-label,'Search Amazon.in')]")).sendKeys("KidsToys"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		//Identify
		driver.findElement(By.xpath("//span[contains(text(),'Wires')]")).click();
		 Thread.sleep(3000); 
		
	}

}
