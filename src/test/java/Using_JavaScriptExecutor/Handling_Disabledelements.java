package Using_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Disabledelements {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
	    //Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the appln
		driver.get("file:///C:/Users/anilc/OneDrive/Attachments/Desktop/New%20folder/SampleWebPage.html");
		
		
		WebElement un_TF = driver.findElement(By.id("user"));
		
		//Handling Disabled TextField
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",un_TF,"selenium");
		
		//HAndle disable Button
		WebElement login = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].disabled=false",login);
		
		login.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
