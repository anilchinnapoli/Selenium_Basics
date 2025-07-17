package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiomart {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the appln
		WebDriver driver = new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
				
		//Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Navigate to appln
		driver.get("https://www.jiomart.com/");
		
		driver.findElement(By.id("rel_pincode")).sendKeys("500086");
		
		driver.findElement(By.id("btn_pincode_submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("header-main-logo jm-mr-m")).click();
		//WebElement ele =driver.findElement(By.xpath("//a[@class=\"jm-btn primary small jm-heading-base jm-fc-white jm-border-none\"]"));
		
		//ele.click();
		//System.out.println(ele.getText());

	}

}
