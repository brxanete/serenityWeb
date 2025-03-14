package com.ktronix.demo.stepdefinitions;

import com.ktronix.demo.models.CellphonesReviewModel;
import com.ktronix.demo.tasks.CellphonesReviewTasks.ViewCellphoneByRam;
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


    @Cuando("^Selecciona una memoria ram en categoria$")
    public void seleccionaUnaMemoriaRamEnCategoria(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                ViewCellphoneByRam.selectRam(cellphonesReviewList.get(0).getRam())
        );





    }

    @Entonces("^Valida filtro correspondiente a la ram elegida$")
    public void validaFiltroCorrespondienteALaRamElegida(List<CellphonesReviewModel> cellphonesReviewList) {
        Bryan.wasAbleTo(
                CheckFirstFilterApplied.compareText(cellphonesReviewList.get(0).getRam())
        );
    }
}
