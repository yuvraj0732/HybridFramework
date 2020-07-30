package org.uv.core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions extends BaseClass {

	public static boolean isElementDisplayed(By ele) {

		boolean flag = true;

		try {
			flag = driver.findElement(ele).isDisplayed();
		} catch (Exception e) {
			flag = false;
			System.out.println("Failed");
		}

		return flag;

	}

	public static void click(By ele) {

		try {
			driver.findElement(ele).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getAttribute(By ele, String attribute) {

		String val = null;

		try {
			val = driver.findElement(ele).getAttribute(attribute);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return val;

	}

	public static void selectByText(By select, String text) {

		WebElement element = driver.findElement(select);

		Select oselect = new Select(element);

		try {
			oselect.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<String> getDropDown(By ele) {

		Select oselect = new Select(driver.findElement(ele));

		List<WebElement> eleCount = oselect.getOptions();
		int iSize = eleCount.size();
		List<String> list = null;

		try {
			for (int i = 0; i < iSize; i++) {

				String svalue = eleCount.get(i).getText();
				list.add(svalue);
				System.out.println(svalue);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	public static void jsClick(By byEle) {

		WebElement element = driver.findElement(byEle);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", element);

	}

	public static void sendkeys(By ele, Keys enter) {

		try {
			driver.findElement(ele).sendKeys(enter);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
