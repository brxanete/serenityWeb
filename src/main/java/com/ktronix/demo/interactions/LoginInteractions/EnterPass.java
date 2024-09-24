package com.ktronix.demo.interactions.LoginInteractions;

import com.ktronix.demo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.ktronix.demo.userinterfaces.HomePage.BTN_MYACCOUNT;
import static com.ktronix.demo.userinterfaces.LoginPage.BTN_LOGIN;
import static com.ktronix.demo.userinterfaces.LoginPage.INP_PASSWORD;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
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
                WaitUntil.the(BTN_LOGIN, isVisible()),
                theValue(password).into(INP_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));


    }


}
