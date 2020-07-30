package org.uv.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.uv.support.Reporting;
import org.uv.support.Utilities;

public class BaseClass {

	private static final WebDriver WebDriver = null;
	public static WebDriver driver;
	
	@BeforeSuite
	public static void initializeReport() throws Exception {
		
		Reporting.startReport();
	//	Reporting.createTest("First Test");
	}

	@BeforeClass
	public WebDriver InvokeBrowser() {

		
		String browser = Utilities.getProperty("browser").toLowerCase();

		switch (browser) {

		case "chrome":

			String exepath = ".\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exepath);

			driver = new ChromeDriver();
			break;

		case "ie":

			String iepath = ".\\Drivers\\\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iepath);

			driver = new ChromeDriver();
			break;

		default:

			System.out.println("No browser found");
			break;

		}
		return WebDriver;

	}

	@BeforeMethod
	public void openURL() {

		driver.get(Utilities.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public static void tearDown() {

	driver.quit();
}
	
	@AfterSuite
	public static void flush() {
		
		System.out.println("flush report");
		Reporting.flushReport();
	}

}
