package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goibibo {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Naavigate to appln
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']"))
		.sendKeys("Delhi");
	
		driver.findElement(By.xpath("//span[text()='New Delhi, India']")).click();
		
		driver.findElement(By.xpath("//span[.='To']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hy");
		
		driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
	}

}
