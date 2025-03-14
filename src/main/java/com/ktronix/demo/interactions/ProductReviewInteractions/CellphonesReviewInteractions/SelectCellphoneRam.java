package com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCellphoneRam implements Interaction {

    private Target locator;

    public SelectCellphoneRam(Target locator) {
        this.locator = locator;
    }

    public static SelectCellphoneRam clickRam(Target locator) {
        return instrumented(SelectCellphoneRam.class, locator);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {


        Bryan.wasAbleTo(
                WaitUntil.the(locator, isVisible()),
                Click.on(locator));


    }
}
