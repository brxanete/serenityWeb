package com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCellphoneScreen implements Interaction {


    private Target locator;

    public SelectCellphoneScreen(Target locator) {
        this.locator = locator;
    }

    public static SelectCellphoneScreen clickScreen(Target locator) {
        return instrumented(SelectCellphoneScreen.class, locator);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {

        Bryan.wasAbleTo(
                WaitUntil.the(locator, isVisible()),
                Click.on(locator));


    }
}
