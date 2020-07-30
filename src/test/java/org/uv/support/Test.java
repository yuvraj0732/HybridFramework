package org.uv.support;

import java.io.IOException;

import com.aventstack.extentreports.Status;

public class Test {

	public static void main(String[] args) throws IOException  {

		Reporting.startReport();
		
		Reporting.createTest("The first Test");
		Reporting.report("first", Status.PASS);

		System.out.println("First Test");
		
		Reporting.flushReport();

	}

}
