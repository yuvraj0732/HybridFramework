package repository.business.Components;

import org.uv.core.Actions;
import org.uv.core.BaseClass;
import org.uv.support.Reporting;

import com.aventstack.extentreports.Status;

import repository.objects.Home;

public class HomePageValidations extends BaseClass{ 
	
	
	
	public static void Validatelinks() {
		
	Actions.isElementDisplayed(Home.HomeMenu);
	Reporting.report("Element visible", Status.PASS);
	
	
		
		
		
	}

}
