package repository.business.Components;

import org.uv.core.Actions;

import repository.objects.Home;

public class LoginValidations {
	
	public static void Validatelinks() {
		
		Actions.isElementDisplayed(Home.HomeMenu);

}
}