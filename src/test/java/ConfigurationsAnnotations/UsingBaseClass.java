package ConfigurationsAnnotations;

import org.testng.annotations.Test;

import BasicClassUtility.BaseClass;

public class UsingBaseClass extends BaseClass {

	@Test
	public void demotest()
	{
		System.out.println("Test scenario1");
	}
	
	@Test
	public void demotest1()
	{
		System.out.println("Test scenario2");
	}
}
