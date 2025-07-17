package TestNG;

import org.testng.annotations.Test;

public class Using_enabled {

	@Test(groups="smoke")
	public void manual() {
		System.out.println("manual");
	}
	
	@Test(enabled=false)
	public void java() {
		System.out.println("java");
	}
	
	@Test(invocationCount = 2)
	public void sql() {
		System.out.println("sql");
	}
	
	
}
