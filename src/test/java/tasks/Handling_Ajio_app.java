package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Ajio_app {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Appln
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//NAvigate to appln
		driver.get("https://www.ajio.com/");
		
		//find element and mouse hover and click on element
        WebElement ele =driver.findElement(By.xpath("//span[.='MEN']"));
        
        //Create A action class
        Actions act = new Actions(driver);
        
        act.moveToElement(ele).perform();
        
        driver.findElement(By.xpath("(//a[.='Shirts'])[1]")).click();
        
        
        
	
	
	}

}
