package SearchContextMethods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_FindElements {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Navigate to the Appln
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//Find all The Links on The Webpage
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:links) {
			System.out.println(ele.getText());
		}
		
		//close the browser
		
		driver.quit();
		

	}

}
