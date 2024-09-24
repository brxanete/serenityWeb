package com.ktronix.demo.interactions.LoginInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.MailPage.BTN_PROCEED;
import static com.ktronix.demo.userinterfaces.MailPage.INP_MAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EnterMail implements Interaction {

    public static String mail;

    public EnterMail(String mail) {
        this.mail = mail;
    }
    public static EnterMail inputMail(String mail) {
        return instrumented(EnterMail.class, mail);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                WaitUntil.the(INP_MAIL, isVisible()),
                theValue(mail).into(INP_MAIL),
                Click.on(BTN_PROCEED));


    }




}


