package org.uv.support;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.uv.core.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting extends BaseClass {
	
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static String dateStamp = Utilities.getCurrentDate();
	public static String timestamp = Utilities.getTimeStamp();
	public static String reportPath= null;
	
	public static void startReport() throws IOException {
		
		extent = new ExtentReports();
		String cwd = System.getProperty("user.dir");
		reportPath = cwd+"/Report/" 
		          + dateStamp + "/Report_" + timestamp.replace(":","_") 
		          + ".html";
		System.out.println(reportPath);
		
		
		ExtentHtmlReporter avent = new ExtentHtmlReporter(reportPath);
		
		avent.config().setReportName("Test Report");
		avent.config().setDocumentTitle("Automation Execution Report");
		avent.config().enableTimeline(false);
		
		extent.attachReporter(avent);
		systeminfo();
		
	}
	
	public static void createTest(String test_name) {
		
		extentTest= extent.createTest(test_name);
	}
	
	
	public static void systeminfo() {
		
		extent.setSystemInfo("OS", "WIN7");
		extent.setSystemInfo("Source URL", Utilities.getProperty("URL"));
	}
	public static void report(String info, Status status) {
		
		switch(status) {
		case PASS:
		extentTest.pass(info);
		break;
		
		case FAIL:
		     extentTest.fail(info);
		     
		break;
		
		case ERROR:
		     extentTest.error(info);
		 break;    
	
		 default:
			 extentTest.log(status.ERROR, "Please provide correct status!");
	}
	}
	
	
      public static void flushReport() {
    	 
    	  extent.flush();
    	  System.out.println(reportPath);
    	  File htmlFile = new File(reportPath);
    	  
    	  try {
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}
    	  
    
    	  }
      }
	
	


