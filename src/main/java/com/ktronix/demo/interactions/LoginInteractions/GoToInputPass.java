package com.ktronix.demo.interactions.LoginInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.AuthenticationPage.BTN_MAIL_PASSWORD;
import static com.ktronix.demo.userinterfaces.HomePage.BTN_MYACCOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToInputPass implements Interaction {
    public static GoToInputPass clickInputPass() {
        return instrumented(GoToInputPass.class);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                WaitUntil.the(BTN_MAIL_PASSWORD, isVisible()),
                Click.on(BTN_MAIL_PASSWORD));
    }




}
