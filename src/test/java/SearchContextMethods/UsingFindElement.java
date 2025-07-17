package SearchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElement {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//NAvigate to the Appln
		driver.get("https://www.facebook.com/");
		
		//FInd Out the UserName TextField
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Mytha123");
		
		//Find out the PAssword TextField
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Manii@123");
		
		//wait for 3 secs
		Thread.sleep(3000);
		
		//Click On Login Button
		driver.findElement(By.xpath("//button[1]")).click();
		

	}

}
