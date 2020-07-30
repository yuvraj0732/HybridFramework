package org.uv.core;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.uv.support.Reporting;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		try {
			System.out.println("Test Starts");
			Reporting.createTest(result.getName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporting.createTest("Test Completed");
	}



      public  void onTestFailure(ITestResult result) {
	

	
}
}