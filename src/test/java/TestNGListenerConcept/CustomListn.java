package TestNGListenerConcept;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListn extends Base implements ITestListener {

	
	
	//@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED Test");
		try {
			Failed();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
