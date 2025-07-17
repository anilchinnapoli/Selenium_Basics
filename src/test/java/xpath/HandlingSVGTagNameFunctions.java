package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGTagNameFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the webpage
		driver.manage().window().maximize();
		
		//Navigate to the appln
		driver.get("https://www.flipkart.com/");
		
		//Identify Search TF and PAss the text
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		
		//Identify Search button icon
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		Thread.sleep(3000);
	}
}
