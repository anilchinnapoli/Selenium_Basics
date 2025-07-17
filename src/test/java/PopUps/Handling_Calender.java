package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Calender {

	public static void main(String[] args) throws InterruptedException {

		// launching the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigating to the application
		driver.get("https://www.makemytrip.com/");

		// clicking on X button
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();

		// identifying the element
		driver.findElement(By.xpath("//span[text()=\"From\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("hyd");
		driver.findElement(By.xpath("//span[text()=\"Hyderabad\"]")).click();

		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("ban");
		driver.findElement(By.xpath("//span[text()=\"Bengaluru\"]")).click();

		driver.findElement(By.xpath(
				"//div[contains(text(),\"June\")]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"27\"]"))
				.click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
