package Pom;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogintest {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to apln
		driver.get("https://www.facebook.com/");
		
//		//To check StaleElementRefernceException
//		WebElement un = driver.findElement(By.id("email"));
//		WebElement pswd = driver.findElement(By.name("pass"));
//		WebElement login = driver.findElement(By.name("login"));
//		
//		un.sendKeys("selenium");
//		driver.navigate().refresh();
//		pswd.sendKeys("pass123");
//		login.click();
		
		//Utilizing Pom Class and handling StaleElementRefernceException
		FBloginPomPage l = new FBloginPomPage(driver);
		
		l.getUN().sendKeys("selenium");
		l.getpswd().sendKeys("abcqwe");
		Thread.sleep(3000);
		
		//Refresh the page
		driver.navigate().refresh();
		Thread.sleep(3000);
		l.getUN().sendKeys("selenium");
		l.getpswd().sendKeys("abcqwe");
		l.getlogin().click();
		
		
		
		
		

	}

}
