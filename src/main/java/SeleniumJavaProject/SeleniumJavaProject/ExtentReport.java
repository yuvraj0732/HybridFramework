package SeleniumJavaProject.SeleniumJavaProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {
	
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		
		ExtentReports extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
	}

}
