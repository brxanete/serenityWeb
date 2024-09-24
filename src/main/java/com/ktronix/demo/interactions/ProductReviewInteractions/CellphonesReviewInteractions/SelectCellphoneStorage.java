package com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCellphoneStorage implements Interaction {

    private Target locator;

    public SelectCellphoneStorage(Target locator) {
        this.locator = locator;
    }

    public static SelectCellphoneStorage clickStorage(Target locator) {
        return instrumented(SelectCellphoneStorage.class, locator);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
  /*      By item = ReplaceLocator.replaceBy(locator, "Replace", spec);
        ReplaceLocator.convertByToTarget(item, "BUTTON CELLPHONE BRAND");*/

        Bryan.wasAbleTo(
                WaitUntil.the(locator, isVisible()),
                Click.on(locator));


    }
}
