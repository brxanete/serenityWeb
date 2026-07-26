package com.ecommerce.demo.tasks.LoginTasks;

import com.ecommerce.demo.questions.CorrectPresenceElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ecommerce.demo.userinterfaces.LoginPage.BAN_LOGIN_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CheckBanError implements Task {


    public static CheckBanError visible() {
        return new CheckBanError();
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                WaitUntil.the(BAN_LOGIN_ERROR, isVisible()));

        Bryan.should(
                seeThat(CorrectPresenceElement.displayed(BAN_LOGIN_ERROR)));

    }

}
