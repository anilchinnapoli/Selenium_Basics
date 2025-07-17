package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_tagname {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the WebPage
		driver.manage().window().maximize();
		
		//Navigate to the browser
		driver.get("https://demowebshop.tricentis.com/");
		
		//IDentify the links in the webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement link:links) {
			
        System.out.println(link.getText());
        
		}
		//close the browser
		driver.quit();  
		
	}

}
