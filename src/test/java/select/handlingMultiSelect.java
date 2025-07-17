package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver =new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the Appln
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		//Identifying the Element and Storing it
		WebElement DD=driver.findElement(By.id("select-multiple-native"));
		
		//Create a Object For select
		Select s= new Select(DD);
		
		//Using Select class and Selecting all options
		s.selectByIndex(19);
		Thread.sleep(3000);
		
		s.selectByValue("Opna Women's Short Sleeve Moisture");
		
		s.selectByVisibleText("MBJ Women's Solid Sh...");
		
		//Fetch all the Selected options
		List<WebElement> opt=s.getAllSelectedOptions();
		for(WebElement ele:opt) {
			System.out.println("All Selected Options : "+ele.getText());
			
		}
		
		//Check For Multi select DD
		System.out.println("Multi select DD: "+s.isMultiple());
		
		WebElement elem =s.getFirstSelectedOption();
		System.out.println("First selected option : "+elem.getText());
		
		
		//select all options in dropdown
		List<WebElement> AllOptions =s.getOptions();
		for(WebElement option:AllOptions) {
			System.out.println("All options in Drop Down "+option.getText());
		}
		
		//Deselect the options
		s.deselectByIndex(19);
		Thread.sleep(3000);
	
		s.deselectByValue("Opna Women's Short Sleeve Moisture");
		Thread.sleep(3000);
		
		s.deselectByVisibleText("MBJ Women's Solid Sh...");
		Thread.sleep(3000);
		
		
		
		
		driver.quit();
	
	}
	}
