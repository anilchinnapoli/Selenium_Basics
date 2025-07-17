package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationpopup {

	public static void main(String[] args) throws InterruptedException {


		//Launch the BRowser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Identify the element 
		//driver.findElement(By.xpath("//a[.='Basic Auth']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
