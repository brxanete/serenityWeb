package com.ktronix.demo.tasks.CellphonesReviewTasks;

import com.ktronix.demo.interactions.ProductReviewInteractions.DeployProductCategory;
import com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions.SelectCellphoneBrand;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.ktronix.demo.userinterfaces.Categories.CellphonesSubPage.*;

public class ViewCellphoneByBrand implements Task {

    private String brand;


    public ViewCellphoneByBrand(String brand) {
        this.brand = brand;

    }

    public static ViewCellphoneByBrand selectBrand(String brand) {
        return new ViewCellphoneByBrand(brand);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                DeployProductCategory.deploy("Celulares")
        );


        switch (brand) {
            case "iPhone":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_IPHONE));
                break;
            case "Samsung":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_SAMSUNG));
                break;
            case "Xiaomi":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_XIAOMI));
                break;
            case "Motorola":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_MOTOROLA));
                break;
            case "vivo":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_VIVO));
                break;
            case "Nokia":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_NOKIA));
                break;
            case "OPPO":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_OPPO));
                break;
            case "Realme":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_REALME));
                break;
            case "zte":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_ZTE));
                break;
            case "TCL":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_TCL));
                break;
            case "Alcatel":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_ALCATEL));
                break;
            case "Kalley":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_KALLEY));
                break;
            case "Huawei":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_HUAWEI));
                break;
            case "Honor":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_HONOR));
                break;
            case "TECNO":
                Bryan.attemptsTo(
                        SelectCellphoneBrand.clickBrand(BTN_BRAND_TECNO));
                break;
            default:
                try {
                    throw new IllegalAccessException("Opcion no válida: " + brand);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}