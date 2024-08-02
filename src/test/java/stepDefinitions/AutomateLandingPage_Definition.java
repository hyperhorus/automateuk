package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AutomateLandingPage;
import utils.TestContextSetup;

public class AutomateLandingPage_Definition {
	
	WebDriver driver;
	AutomateLandingPage automateLandingPage;
	TestContextSetup testContextSetup;
	
	public AutomateLandingPage_Definition (TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	
	@Given("Navego a la pagina principal")
	public void navego_a_la_pagina_principal() {
	    automateLandingPage = testContextSetup.pageObjectManager.getAutomatedPage();
	}
	@When("El usuario navega a  las tres primeras opciones del menu")
	public void el_usuario_navega_a_las_tres_primeras_opciones_del_menu() {
		automateLandingPage.accordionClick();
		automateLandingPage.acctionClick();
		automateLandingPage.browserTabClick();
	
	}
	@Then("Las paginas de cada una de las opciones se despliegan")
	public void las_paginas_de_cada_una_de_las_opciones_se_despliegan() {
		System.out.println("El then");
	}
	
	@When("Usuario navega a la seccion Accordion")
	public void usuario_navega_a_la_seccion_accordion() {
		automateLandingPage.accordionClick();
	}
	@Then("Usuario verifica que se desplego la pagina de Accordion")
	public void usuario_verifica_que_se_desplego_la_pagina_de_accordion() {
		automateLandingPage.platPortasection();
		automateLandingPage.languageSupport();
	}





}
