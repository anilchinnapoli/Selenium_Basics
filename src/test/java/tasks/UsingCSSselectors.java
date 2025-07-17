package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSselectors {
 
	public static void main(String[] args) {
	
	 //launch the browser
	 WebDriver driver =new ChromeDriver();
	 
	 // Maximize the Webpage
	 driver.manage().window().maximize();
	 
	 //NAvigate to the Webpage
	 driver.get("https://www.flipkart.com/");
	 
	 //Identify The Cart Link and Click on Log in button
	 
	 driver.findElement(By.cssSelector("a[title='Cart']")).click();
	 
	 driver.findElement(By.cssSelector("button[class='QqFHMw aEsfVh _7Pd1Fp']")).click();
	 
	 driver.findElement(By.cssSelector("input[class='r4vIwl _5BVqVB tuMj3n BV+Dqf']")).sendKeys("6309485936");
	 

  }


 }
