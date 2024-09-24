package com.ktronix.demo.interactions.ProductReviewInteractions;

import com.ktronix.demo.utils.enums.ReplaceLocator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static com.ktronix.demo.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeployProductCategory implements Interaction {

    private String replaceLocator;

    public DeployProductCategory(String replaceLocator) {
        this.replaceLocator = replaceLocator;
    }
    public static DeployProductCategory deploy(String replaceLocator){
        return instrumented (DeployProductCategory.class, replaceLocator);
    }


    @Override
    public <X extends Actor> void performAs(X Bryan) {

        By item = ReplaceLocator.replaceBy(BTN_CATEGORY, "Replace", replaceLocator);
        ReplaceLocator.convertByToTarget(item, "BUTTON CATEGORY");

        Bryan.attemptsTo(
                WaitUntil.the(item, isVisible()),
                MoveMouse.to(item));

    }
}
