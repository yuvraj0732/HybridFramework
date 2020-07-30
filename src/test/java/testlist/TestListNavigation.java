package testlist;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uv.core.BaseClass;

import repository.business.Components.HomePageValidations;

@Listeners(org.uv.core.Listeners.class)
public class TestListNavigation extends BaseClass{
	
	
	@Test
	public static void Navigation() {
		
		HomePageValidations.Validatelinks();
		
	}
}
