 package Using_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntertheText_ClickonAnElementUsingJSE {

	public static void main(String[] args) throws InterruptedException {
	
		//LAunch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement pswd= driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		//Pass the Text to TF
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='selenium'",un);
		
		js.executeScript("arguments[0].value=arguments[1]",pswd,"abc123");
		
		Thread.sleep(3000);
		
		//Click on Login Button
		js.executeScript("arguments[0].click()",login);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
