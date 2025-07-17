package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFrames_usingID {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the Browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an appln
		driver.get("https://www.zomato.com/india");
		
		//Click on the Login linkk
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//Switch to frame using ID
		driver.switchTo().frame("auth-login-ui");
		
		//Send text in Mobile Number TF
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("6325365252");
		Thread.sleep(3000);
		
		//Click on Close Button
		driver.findElement(By.xpath("//i[@aria-label=\"close Modal\"]")).click();
		Thread.sleep(3000);
		
		//Switch back to main webpage
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//Click on Add Restaurant link
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
