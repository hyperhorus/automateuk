package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomateLandingPage {
	public WebDriver driver;
	
	public AutomateLandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By accordionOpt = By.xpath("//div[@id='sidebar']//a[contains(@href,'accordion.html')]");
	By actionOpt = By.xpath("//div[@id='sidebar']//a[contains(@href,'actions.html')]");
	
	public void accordionClick() {
		driver.findElement(accordionOpt).click();;
	}
	
	public void acctionClick() {
		driver.findElement(actionOpt).click();;
	}
	
	
	
}
