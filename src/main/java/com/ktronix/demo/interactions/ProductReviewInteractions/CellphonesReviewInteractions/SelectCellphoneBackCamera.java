package com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCellphoneBackCamera implements Interaction {

    private Target locator;

    public SelectCellphoneBackCamera(Target locator) {
        this.locator = locator;
    }

    public static SelectCellphoneBackCamera clicCamera(Target locator) {
        return instrumented(SelectCellphoneBackCamera.class, locator);
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
