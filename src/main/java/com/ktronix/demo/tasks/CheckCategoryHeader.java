package com.ktronix.demo.tasks;

import com.ktronix.demo.questions.CorrectElementText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.ProductsSearchedPage.TXT_HEADER;
import static com.ktronix.demo.userinterfaces.ProductsSearchedPage.TXT_RESULTS_COUNT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;


public class CheckCategoryHeader implements Task {

    private String brand;

    public CheckCategoryHeader(String brand) {
        this.brand = brand;
    }

    public static CheckCategoryHeader compareText(String brand) {
        return instrumented(CheckCategoryHeader.class, brand);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                WaitUntil.the(TXT_RESULTS_COUNT, isVisible()));

        Bryan.should(
                seeThat(CorrectElementText.displayed(TXT_HEADER), containsString(brand))
        );


    }
}
