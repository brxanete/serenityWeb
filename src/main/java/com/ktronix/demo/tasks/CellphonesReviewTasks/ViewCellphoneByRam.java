package com.ktronix.demo.tasks.CellphonesReviewTasks;

import com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions.SelectCellphoneRam;
import com.ktronix.demo.interactions.ProductReviewInteractions.DeployProductCategory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.ktronix.demo.userinterfaces.Categories.CellphonesSubPage.*;

public class ViewCellphoneByRam implements Task {

    private String ram;


    public ViewCellphoneByRam(String brand) {
        this.ram = brand;

    }

    public static ViewCellphoneByRam selectRam(String brand) {
        return new ViewCellphoneByRam(brand);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                DeployProductCategory.deploy("Celulares")
        );


        switch (ram) {
            case "2 GB":
                Bryan.attemptsTo(
                        SelectCellphoneRam.clickRam(BTN_2GB_RAM));
                break;
            case "4 GB":
                Bryan.attemptsTo(
                        SelectCellphoneRam.clickRam(BTN_4GB_RAM));
                break;

            default:
                try {
                    throw new IllegalAccessException("Opcion no válida: " + ram);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}