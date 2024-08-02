package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public AutomateLandingPage automateLandingPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public AutomateLandingPage getAutomatedPage() {
		automateLandingPage = new AutomateLandingPage(driver);
		return automateLandingPage;
	}

}
