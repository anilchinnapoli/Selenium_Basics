package AutoSuggestions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
public class Handing_AutoSuggestions {
  
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the appln
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("sel");
		
	List<WebElement>	suggs=driver.findElements(By.xpath("//span[contains(text(),'sel')]"));
		
		for(WebElement ele : suggs) {
			System.out.println(ele.getText());
		}
		
		driver.findElement(By.xpath("//b[contains(text(),'enium')]")).click();
	}
}
