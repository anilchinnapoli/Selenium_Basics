package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingfileupload {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the BRowser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the Window
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://the-internet.herokuapp.com/upload");
				
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\anilc\\OneDrive\\Attachments\\Desktop");
				
				Thread.sleep(3000);
				
				driver.quit(); 
				

	}

}
