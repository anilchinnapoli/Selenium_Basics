package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_JavaScript_AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//LAunch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Click on JS Alert
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		
		//Switch on alert popup
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		 
		// al.dismiss();In 
		//Identify result and print
		WebElement ele = driver.findElement(By.id("result"));
		System.out.println(ele.getText());
		
		driver.quit();
		
		//UnhandledAlert Exception =
//NoAlertPresentException =  When we are not clicking on Element 
		//                   which gives the popup by clicking the element So then 
		//                    we get NoAlertPresentException
	}

}
