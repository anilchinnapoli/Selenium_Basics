package ListenersUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class Listeners implements ITestListener,ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Suite Execution Started");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("Suite Execution Ended");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start Execution");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execution Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Execution Failed");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Execution Skipped");
	}

}
