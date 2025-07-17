package select;

import java.time.Duration;

//import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsOnException.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HandlingSingleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		
		 // Launch the browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the Appln
		driver.get("https://www.amazon.in/");
		
		//Identify the DropDown
		WebElement DD=driver.findElement(By.id("searchDropdownBox"));
		
		//Create the object for select class
		 Select s=new Select(DD);
		 
		 //Select an option by index
	     s.selectByIndex(9);
	     
	     Thread.sleep(3000);
	     
	     //Select an option by Value
	     s.selectByValue("search-alias=electronics");
	     
	     Thread.sleep(3000);
	     
	     //Select an option by VisibleText
	     s.selectByVisibleText("Industrial & Scientific");
	     
	     Thread.sleep(3000);
	     
	     //Fetching all the options from the DD
	     //Iterate using for each loop and print the text from the option
	     List<WebElement> options = s.getOptions(); 
	     
	     System.out.println("size of list"+options.size());
	     
	     for (WebElement op:options)
	     {
	    	 System.out.println(op.getText());
	     }
	     
	     //Check the DD for Single or multi
	     System.out.println("Multi select DD: "+s.isMultiple());
	     
	     //Fetch the First Selected options
	     WebElement option =s.getFirstSelectedOption();
	     System.out.println("First Selected Option: "+option.getText());
	     
	     //Fetch all the Selected options
	     List<WebElement> selected=s.getAllSelectedOptions();
	     for(WebElement ele: selected)
	     {
	    	 System.out.println("All the selected options: "+ele.getText());
	     }
	     
	     
	     driver.quit();
	     
	     
		 

	}

}
