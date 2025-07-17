package tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestions {
 
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver =new ChromeDriver();
		
		//MAximize the Window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://www.google.com/");
		
		//Find the TF element and Pass the Text
		driver.findElement(By.name("q")).sendKeys("sel");
		
		//Identify the text suggestions 
	    List<WebElement>  suggs= driver.findElements(By.xpath("//span[text()='sel']"));
	    
	    //Iterate and print it
	    for(WebElement ele : suggs) {
	    	
	    	System.out.println(ele.getText());
	    	
	    }
	    
	   suggs.get(7).click();
	
	}
}
