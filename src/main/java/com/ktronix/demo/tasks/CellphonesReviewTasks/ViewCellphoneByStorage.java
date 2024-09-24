package com.ktronix.demo.tasks.CellphonesReviewTasks;

import com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions.SelectCellphoneBrand;
import com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions.SelectCellphoneStorage;
import com.ktronix.demo.interactions.ProductReviewInteractions.DeployProductCategory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.ktronix.demo.userinterfaces.Categories.CellphonesSubPage.*;

public class ViewCellphoneByStorage implements Task {

    private String storage;


    public ViewCellphoneByStorage(String storage) {
        this.storage = storage;

    }

    public static ViewCellphoneByStorage selectStorage(String storage) {
        return new ViewCellphoneByStorage(storage);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                DeployProductCategory.deploy("Celulares")
        );


        switch (storage) {
            case "32 GB":
                Bryan.attemptsTo(
                        SelectCellphoneStorage.clickStorage(BTN_STORAGE_32));
                break;
            case "64 GB":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_STORAGE_64));
                break;
            case "128 GB":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_STORAGE_128));
                break;
            case "256 GB":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_STORAGE_256));
                break;
            case "512 GB":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_STORAGE_512));
                break;
            case "1 Tera":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_STORAGE_1024));
                break;

            default:
                try {
                    throw new IllegalAccessException("Opcion no válida: " + storage);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}