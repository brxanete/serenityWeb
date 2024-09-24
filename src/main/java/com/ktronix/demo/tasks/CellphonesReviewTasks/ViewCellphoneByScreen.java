package com.ktronix.demo.tasks.CellphonesReviewTasks;

import com.ktronix.demo.interactions.ProductReviewInteractions.DeployProductCategory;
import com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions.SelectCellphoneScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.ktronix.demo.userinterfaces.Categories.CellphonesSubPage.*;



public class ViewCellphoneByScreen implements Task {

    private final String tamanioPantalla;

    public ViewCellphoneByScreen(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public static ViewCellphoneByScreen selectScreen(String tamanioPantalla) {
        return new ViewCellphoneByScreen(tamanioPantalla);


    }


    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                DeployProductCategory.deploy("Celulares")
        );

        switch (tamanioPantalla) {
            case "De 3.1' a 4'":
                Bryan.attemptsTo(
                        SelectCellphoneScreen.clickScreen(BTN_SCREEN_31_A_4));
                break;
            case "De 4.1' a 5'":
                Bryan.attemptsTo(
                        SelectCellphoneScreen.clickScreen(BTN_SCREEN_41_A_5));
                break;
            case "De 5.1' a 6'":
                Bryan.attemptsTo(
                        SelectCellphoneScreen.clickScreen(BTN_SCREEN_51_A_6));
                break;
            case "De 6.1' a 8'":
                Bryan.attemptsTo(
                        SelectCellphoneScreen.clickScreen(BTN_SCREEN_61_A_8));
                break;
            default:
                try {
                    throw new IllegalAccessException("Opcion no válida: " + tamanioPantalla);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }


        }


    }


}

  



