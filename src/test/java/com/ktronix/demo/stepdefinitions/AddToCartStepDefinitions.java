package com.ktronix.demo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AddToCartStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor Bryan = Actor.named("Bryan");

    @Before
    public void preparedActorStage() {
        // Prepara todas la habilidades del actor (Web, mobile, API, desktop) por escenario
        OnStage.setTheStage(new OnlineCast());
        // El actor puede navegar a través de la web con el webDriver
        Bryan.can(BrowseTheWeb.with(webDriver));
    }

    @Cuando("^Agrega al carro de compra el primer producto de la lista$")
    public void agregaAlCarroDeCompraElPrimerProductoDeLaLista() {


    }
}
