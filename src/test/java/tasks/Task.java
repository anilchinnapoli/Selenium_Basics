package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		 
		//Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the Webpage
		driver.manage().window().maximize();
		
		//Navigate to the Browser
		driver.get("https://www.selenium.dev/");
		
		//Identify the Downloads Link and Click on it
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		
		//
WebElement versions=driver.findElement(By.xpath("(//p[@class='card-title fw-bold h6'])[3]/../p[2]/a[text()='4.33.0 (May 23, 2025)']"));

System.out.println(versions.getText());
	}

}
