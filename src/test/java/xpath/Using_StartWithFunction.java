package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_StartWithFunction {
 public static void main(String[] args) {
	
	 //launch the browser
	 WebDriver driver = new ChromeDriver();
	 
	 //Maximize the WebPage
	 driver.manage().window().maximize();
	 
	 //Navigate to the Webpage
	 driver.get("https://www.facebook.com/");
	 
	
	 driver.findElement(By.xpath("//input[starts-with(@placeholder,'E')]")).sendKeys("vikkas");

	 driver.findElement(By.xpath("//input[starts-with(@name,'p')]")).sendKeys("subbu");
	 
	 driver.findElement(By.xpath("//button[starts-with(@name,'login')]")).click();
 
 }
 
}
