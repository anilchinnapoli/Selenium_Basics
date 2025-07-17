package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_XpathOperators {

	public static void main(String[] args) throws InterruptedException {
		
		//Launnch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the WebPage
		driver.manage().window().maximize();
		
		//Navigate to the appln
		driver.get("https://www.facebook.com/");
		
		//
		driver.findElement(By.xpath("//input[@name='email' and @data-testid='royal-email' ]")).sendKeys("vikassubbu");
		
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi' or@aria-label='word']")).sendKeys("rajuu");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login' and@type='submit']")).click();
		
		

	}

}
