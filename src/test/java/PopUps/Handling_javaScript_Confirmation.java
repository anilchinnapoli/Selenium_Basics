package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_javaScript_Confirmation {

	public static void main(String[] args) {


		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximze the Window
		driver.manage().window().maximize();
		
		//Implicity Wit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//NAvigate to appln
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Click on Js Confirm
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		
		//Switch on confirm Popup
		Alert al = driver.switchTo().alert();
		al.dismiss();
		
		//al.accept();
		//Identify the text
		WebElement ele=driver.findElement(By.id("result"));
		System.out.println(ele.getText());

	}

}
