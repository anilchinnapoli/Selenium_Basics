package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_XpathAXES {

	public static void main(String[] args) {

		//Launch the Browser
		WebDriver driver = new EdgeDriver();
		
		//MAximize the WebPage
		driver.manage().window().maximize();
		
		//Navigate to the Webpage
		driver.get("https://www.amazon.in/");
		//Using Ancestor and Descendent
		
		//Identify the search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys"+Keys.ENTER);
		
		//
		 WebElement price=driver.findElement(By.xpath
				("//span[contains(text(),'Gooyo GY3716')]/ancestor::div[contains(@class,'a-section a-spacing-small')]/descendant::span[@class='a-price-whole']"));
	
		 System.out.println(price.getText());
	}
	

}
