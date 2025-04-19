package com.ktronix.demo.interactions.LoginInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.ktronix.demo.userinterfaces.LoginPage.BTN_CONTINUE;
import static com.ktronix.demo.userinterfaces.LoginPage.INP_PASSWORD;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterPass implements Interaction {

    private String password;

    public EnterPass(String password) {
        this.password = password;
    }
    public static EnterPass inputPass(String password) {
        return instrumented(EnterPass.class, password);
    }


    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                WaitUntil.the(INP_PASSWORD, isVisible()),
                WaitUntil.the(INP_PASSWORD, isEnabled()),
                theValue(password).into(INP_PASSWORD),
                WaitUntil.the(BTN_CONTINUE, isVisible()),
                WaitUntil.the(BTN_CONTINUE, isEnabled()),
                Click.on(BTN_CONTINUE));


    }


}
