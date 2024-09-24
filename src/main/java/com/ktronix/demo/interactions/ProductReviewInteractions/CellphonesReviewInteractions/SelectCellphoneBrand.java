package com.ktronix.demo.interactions.ProductReviewInteractions.CellphonesReviewInteractions;

import com.ktronix.demo.utils.enums.ReplaceLocator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCellphoneBrand implements Interaction {

    private Target locator;

    public SelectCellphoneBrand(Target locator) {
        this.locator = locator;
    }

    public static SelectCellphoneBrand clickBrand(Target locator) {
        return instrumented(SelectCellphoneBrand.class, locator);
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
