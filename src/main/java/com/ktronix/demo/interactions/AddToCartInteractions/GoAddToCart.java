package com.ktronix.demo.interactions.AddToCartInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.ProductsSearchedPage.BTN_ADD_TO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoAddToCart implements Interaction {

    public static GoAddToCart clickAddToCart(){
        return instrumented(GoAddToCart.class);

    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                WaitUntil.the(BTN_ADD_TO_CART, isVisible()),
                Click.on(BTN_ADD_TO_CART));

    }
}
