package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomateLandingPage_Definition {
	
	@Given("Navego a la pagina principal")
	public void navego_a_la_pagina_principal() {
	    System.out.println("El given");
	}
	@When("El usuario navega a  las tres primeras opciones del menu")
	public void el_usuario_navega_a_las_tres_primeras_opciones_del_menu() {
		System.out.println("El when");
	}
	@Then("Las paginas de cada una de las opciones se despliegan")
	public void las_paginas_de_cada_una_de_las_opciones_se_despliegan() {
		System.out.println("El then");
	}




}
