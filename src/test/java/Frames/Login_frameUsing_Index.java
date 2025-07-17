package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_frameUsing_Index {

	public static void main(String[] args) throws InterruptedException {
		
		// launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://the-internet.herokuapp.com/frames");

		// Click on the iframe link
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();

		// Switch to frame using Index
		driver.switchTo().frame(0);

		// Fetch the sentence 
		 WebElement ele=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		 System.out.println(ele.getText());
		 
		Thread.sleep(3000);

		// Switch back to main webpage
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		// Click on Add Restaurant link
		driver.findElement(By.linkText("//span[text()='Paragraph']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
