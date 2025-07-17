package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_PromptPopUp {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to aplln
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Click on Prompt popup
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		
		//Select the Prompt
		Alert al =driver.switchTo().alert();
		al.sendKeys("selenium");
		al.accept();
		
		//Identify the text
	    WebElement ele =driver.findElement(By.id("result"));
	    System.out.println(ele.getText());
	    
	}

}
