package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_Notification_popup {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Device
		
		//Create Chrome options Object
		
		ChromeOptions opt= new ChromeOptions();
		
		opt.addArguments("--disable-notifications"); //It will
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver(opt);
		//Here if we are not giving refrence variable to chromedriver then 
		// it will show the Popup
		//MAximize the Window
		driver.manage().window().maximize();
		
		//Implicit WAit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to aPPLN
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//Identify POpUps Element
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		
		driver.findElement(By.xpath("//section[.='Notifications']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[.='Notification']")).click();
		
		

	}

}
