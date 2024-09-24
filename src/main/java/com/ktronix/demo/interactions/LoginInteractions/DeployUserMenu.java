package com.ktronix.demo.interactions.LoginInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.HomePage.BTN_MYACCOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeployUserMenu implements Interaction {
    public static DeployUserMenu deployMyAccount() {
        return instrumented(DeployUserMenu.class);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                WaitUntil.the(BTN_MYACCOUNT, isVisible()),
                MoveMouse.to(BTN_MYACCOUNT));


    }


}
