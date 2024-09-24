package com.ktronix.demo.stepdefinitions;

import com.ktronix.demo.models.CellphonesReviewModel;
import com.ktronix.demo.tasks.CellphonesReviewTasks.ViewCellphoneByScreen;
import com.ktronix.demo.tasks.CellphonesReviewTasks.ViewCellphoneByStorage;
import com.ktronix.demo.tasks.CheckCategoryHeader;
import com.ktronix.demo.tasks.CellphonesReviewTasks.ViewCellphoneByBrand;
import com.ktronix.demo.tasks.CheckFirstFilterApplied;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CellphonesReviewStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor Bryan = Actor.named("Bryan");

    //Preparar al actor
    @Before
    public void preparedActorStage() {
        // Prepara todas la habilidades del actor (Web, mobile, API, desktop) por escenario
        OnStage.setTheStage(new OnlineCast());
        // El actor puede navegar a través de la web con el webDriver
        Bryan.can(BrowseTheWeb.with(webDriver));
    }


    @Cuando("^Selecciona una marca en categoria celulares$")
    public void seleccionaUnaMarcaEnCategoriaCelulares(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                ViewCellphoneByBrand.selectBrand(cellphonesReviewList.get(0).getMarca())
        );

    }


    @Entonces("^Valida encabezado correspondiente a la marca de celular elegida$")
    public void validaEncabezadoCorrespondienteALaMarcaDeCelularElegida(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                CheckCategoryHeader.compareText(cellphonesReviewList.get(0).getMarca())
        );
    }


    @Cuando("^Selecciona un almacenamiento en categoria celulares$")
    public void seleccionaUnAlmacenamientoEnCategoriaCelulares(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                ViewCellphoneByStorage.selectStorage(cellphonesReviewList.get(0).getAlmacenamiento())
        );
    }

    @Entonces("^Valida filtro correspondiente al almacenamiento elegido$")
    public void validaFiltroCorrespondienteAlAlmacenamientoElegido(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                CheckFirstFilterApplied.compareText(cellphonesReviewList.get(0).getAlmacenamiento())
        );
    }

    @Cuando("^Selecciona un tamanio de pantalla en categoria celulares$")
    public void seleccionaUnTamanioDePantallaEnCategoriaCelulares(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                ViewCellphoneByScreen.selectScreen(cellphonesReviewList.get(0).getTamanioPantalla())
        );

    }

    @Entonces("^Valida filtro correspondiente al tamanio de pantalla elegido$")
    public void validaFiltroCorrespondienteAlTamanioDePantallaElegido(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(



        );
    }


}
