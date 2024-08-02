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
	By browserTabsOpt = By.xpath("//div[@id='sidebar']//a[contains(@href,'browserTabs.html')]");
	By accorPlatPortability = By.xpath("//div[@class='accordion']/div[1]");
	By languageSupport = By.xpath("//div[@class='accordion']/div[3]");
	
	
	public void accordionClick() {
		driver.manage().window().maximize();
		driver.findElement(accordionOpt).click();
	}
	
	public void acctionClick() {
		driver.findElement(actionOpt).click();
	}
	
	public void browserTabClick() {
		driver.findElement(browserTabsOpt).click();
	}
	
	//Para la seccion de accordion
	public void platPortasection() {
		driver.findElement(accordionOpt).click();
		driver.findElement(accorPlatPortability).click();
	}
	
	public void languageSupport() {
		driver.findElement(languageSupport).click();
	}
	
}
