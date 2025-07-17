package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_DragandDrop {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the Window
		driver.manage().window().maximize();
				
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Navigate to the appln
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Perform Drag Drop Operations
		WebElement drag_ele1 =driver.findElement(By.id("fourth"));
		WebElement drop_loc1 =driver.findElement(By.id("amt7"));
		
		WebElement drag_ele2 = driver.findElement(By.id("credit2"));
		//WebElement drop_loc2 = driver.findElement(By.);
		
		//WebElement drag_ele3 =driver.findElement(By.id("fourth"));
		//WebElement drop_loc3 =driver.findElement(By.id(null));
		
		
		
		Actions act = new Actions(driver);
		
		//act.dragAndDrop(drag_ele1, drop_loc1).dragAndDrop(drag_ele2, drop_loc2).perform();
	}

}
