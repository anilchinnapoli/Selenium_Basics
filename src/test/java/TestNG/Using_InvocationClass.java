package TestNG;

import org.testng.annotations.Test;

public class Using_InvocationClass {

	@Test(priority=2,groups="smoke")
	public void manual() {
		System.out.println("manual");
	}
	
	@Test(priority=1 )
	public void sql() {
		System.out.println("sql");
	}
	
	@Test(priority=3,invocationCount = 3)
	public void java() {
		System.out.println("java");
	}
}
