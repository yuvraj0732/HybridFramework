package repository.objects;

import org.openqa.selenium.By;

public class Home {
	
	
	public static final By HomeMenu= By.xpath("//a[@id='nav-hamburger-menu']");
	public static final By txtHello= By.xpath("//div[@id='glow-ingress-block']/span[contains(text(),\"Hello\")]");
	
}
