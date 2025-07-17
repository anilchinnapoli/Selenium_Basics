package ListenersUtilization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasicClassUtility.BaseClass;
@Listeners(ListenersUtility.Listeners.class)
public class Listeners2 extends BaseClass {
	
	
	@Test
	public void demo1() {
		System.out.println("Demoshop");
	}

}
