package com.ktronix.demo.tasks;

import com.ktronix.demo.questions.CorrectElementText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.ProductsSearchedPage.TXT_FILTER_ONE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsString;

public class CheckFirstFilterApplied implements Task {

    private String spec;

    public CheckFirstFilterApplied(String storage) {
        this.spec = storage;
    }

    public static CheckFirstFilterApplied compareText(String storage) {
        return instrumented(CheckFirstFilterApplied.class, storage);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                WaitUntil.the(TXT_FILTER_ONE, isVisible()));


        Bryan.should(
                seeThat(CorrectElementText.displayed(TXT_FILTER_ONE), containsString(spec)));


    }

}
