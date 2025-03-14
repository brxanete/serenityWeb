package com.ktronix.demo.interactions.LoginInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.AuthenticationPage.BTN_MAIL_PASSWORD;
import static com.ktronix.demo.userinterfaces.HomePage.BTN_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class GoToLogin implements Interaction {
    public static GoToLogin clickLogin() {
        return instrumented(GoToLogin.class);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {

        Bryan.wasAbleTo(
                WaitUntil.the(BTN_LOGIN, isVisible()),
                Click.on(BTN_LOGIN));

    }
}


